package es.ulpgc.eite.da.orderingitems;

import android.view.View;
import android.widget.ListView;

import androidx.test.uiautomator.UiDevice;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import es.ulpgc.eite.da.orderingitems.data.ItemData;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.hamcrest.Matchers.allOf;

public class OrderingItemsRobot {



  private static Matcher<View> withListSize(String str) {

    final int size = Integer.valueOf(str);

    return new TypeSafeMatcher<View>() {

      @Override
      public boolean matchesSafely(final View view) {
        return ((ListView) view).getCount() == size;
      }

      @Override
      public void describeTo(final Description description) {
        description.appendText("ListView should have " + size + " items");
      }
    };
  }


  private static Matcher<View> withTextAndValueAtPosition(
      final String val, String strPos) {

    final int pos = Integer.valueOf(strPos);

    return new TypeSafeMatcher<View>() {

      @Override
      public boolean matchesSafely(final View view) {
        int size = ((ListView) view).getCount();
        if (pos-1 >= size) {
          return false;
        }

        Object obj = ((ListView) view).getItemAtPosition(pos-1);
        ItemData item = (ItemData) obj;
        return item.letter.equals(val) && item.position.equals(pos-1);
      }

      @Override
      public void describeTo(final Description description) {
        description.appendText(
            "ListView should have " + val + " value at position " + pos
        );
      }
    };
  }

  public void rotar_pantalla() {

    try {

      UiDevice device = UiDevice.getInstance(getInstrumentation());

      Thread.sleep(700);
      device.setOrientationLeft();
      Thread.sleep(700);
      device.setOrientationNatural();
      Thread.sleep(700);

    } catch (Exception e) {

    }

  }
  
  public void pulsar_boton_de_lista_de_items() {
    onView(withId(R.id.fabList)).perform(click());
  }

  public void mostrar_lista_de_items_con_dimension(String size) {
    onView(withId(R.id.itemList)).check(matches(withListSize(size)));
  }

  public void pulsar_item_en_posicion_de_lista(String pos) {
    onData(allOf())
        .inAdapterView(withId(R.id.itemList))
        .atPosition(Integer.valueOf(pos)-1)
        .perform(click());
  }

  public void pulsar_boton_back() {
    pressBack();
  }

  public void pulsar_boton_de_item() {
    onView(withId(R.id.fabDetail)).perform(click());
  }

  public void mostrar_item_con_texto_en_posicion_de_lista(String txt, String pos) {
    onView(withId(R.id.itemList))
        .check(matches(withTextAndValueAtPosition(txt, pos)));
  }

  public void mostrar_item_con_texto_y_posicion_en_lista_de_items(String txt, String pos) {
    onView(withId(R.id.itemText)).check(matches(withText(txt)));
    onView(withId(R.id.posText)).check(matches(withText(pos)));
  }

}
