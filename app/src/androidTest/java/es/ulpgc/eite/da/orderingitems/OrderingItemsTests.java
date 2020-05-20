package es.ulpgc.eite.da.orderingitems;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import es.ulpgc.eite.da.orderingitems.items.ItemListActivity;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class OrderingItemsTests { // 20 tests


  @Rule
  public ActivityTestRule<ItemListActivity> rule =
      new ActivityTestRule(ItemListActivity.class);

  private OrderingItemsRobot robot = new OrderingItemsRobot();




  @Test
  public void test01_crear_primer_item() {


    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");

    // When pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();

    // Then mostrar item con texto "A" en posicion "1" de lista
    // And mostrar lista de items con dimension "1"
    robot.mostrar_lista_de_items_con_dimension("1");
  }

  @Test
  public void test02_crear_segundo_item() {
    
 
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    
    // When pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    
    // Then mostrar item con texto "A" en posicion "1" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("A", "1");
    // And mostrar item con texto "B" en posicion "2" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("B", "2");
    // And mostrar lista de items con dimension "2"
    robot.mostrar_lista_de_items_con_dimension("2");
  }

  @Test
  public void test03_mostrar_primer_item() {
    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    
    // When pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
        
    // Then mostrar item con texto "A" y posicion "1" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("A", "1");
    // And mostrar posicion "1" en lista de items
  }

  @Test
  public void test04_actualizar_primer_item() {


    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    
    // When pulsar boton de item
    robot.pulsar_boton_de_item();
    
    // Then mostrar item con texto "A" y posicion "2" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("A", "2");
  }

  @Test
  public void test05_mostrar_lista_de_items_por_actualizar_primer_item() {
    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    
    // When pulsar boton back
    robot.pulsar_boton_back();
    
    // Then mostrar item con texto "B" en posicion "1" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("B", "1");
    // And mostrar item con texto "A" en posicion "2" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("A", "2");
    // And mostrar lista de items con dimension "2"
    robot.mostrar_lista_de_items_con_dimension("2");
  }

  @Test
  public void test06_crear_tercer_item() {
    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    
    // When pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And rotar pantalla
    robot.rotar_pantalla();
    
    // Then mostrar item con texto "B" en posicion "1" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("B", "1");
    // And mostrar item con texto "A" en posicion "2" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("A", "2");
    // And mostrar item con texto "C" en posicion "3" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("C", "3");
    // And mostrar lista de items con dimension "3"
    robot.mostrar_lista_de_items_con_dimension("3");
  }

  @Test
  public void test07_mostrar_tercer_item() {

    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    
    // When pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    
    // Then mostrar item con texto "C" y  posicion "3" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("C", "3");
  }

  @Test
  public void test08_actualizar_tercer_item() {
    

    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    
    // When pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And rotar pantalla
    robot.rotar_pantalla();

    // Then mostrar item con texto "C" y posicion "2" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("C", "2");
  }

  @Test
  public void test09_mostrar_lista_de_items_por_actualizar_tercer_item() {
    

    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    
    // When pulsar boton back
    robot.pulsar_boton_back();
    // And rotar pantalla
    robot.rotar_pantalla();

    // Then mostrar item con texto "A" en posicion "1" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("A", "1");
    // And mostrar item con texto "C" en posicion "2" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("C", "2");
    // And mostrar item con texto "B" en posicion "3" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("B", "3");
    // And mostrar lista de items con dimension "3"
    robot.mostrar_lista_de_items_con_dimension("3");
  }

  @Test
  public void test10_actualizar_primer_item() {
    
 
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");

    // When pulsar boton de item
    robot.pulsar_boton_de_item();
    
    // Then mostrar item con texto "A" y posicion "2" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("A", "2");
  }

  @Test
  public void test11_mostrar_lista_de_items_por_actualizar_primer_item() {
    
 
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    
    // When pulsar boton back
    robot.pulsar_boton_back();
    
    // Then mostrar item con texto "B" en posicion "1" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("B", "1");
    // And mostrar item con texto "A" en posicion "2" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("A", "2");
    // And mostrar item con texto "C" en posicion "3" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("C", "3");
    // And mostrar lista de items con dimension "3"
    robot.mostrar_lista_de_items_con_dimension("3");
  }

  @Test
  public void test12_mostrar_tercer_item() {

    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    
    // When pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And rotar pantalla
    robot.rotar_pantalla();

    // Then mostrar item con texto "C" y posicion "3" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("C", "3");
  }

  @Test
  public void test13_actualizar_tercer_item() {
    
    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    
    // When pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And rotar pantalla
    robot.rotar_pantalla();

    // Then mostrar item con texto "C" y posicion "2" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("C", "2");
  }

  @Test
  public void test14_mostrar_lista_de_items_por_actualizar_tercer_item() {
    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    
    // When pulsar boton back
    robot.pulsar_boton_back();
    // And rotar pantalla
    robot.rotar_pantalla();

    // Then mostrar item con texto "A" en posicion "1" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("A", "1");
    // And mostrar item con texto "C" en posicion "2" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("C", "2");
    // And mostrar item con texto "B" en posicion "3" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("B", "3");
    // And mostrar lista de items con dimension "3"
    robot.mostrar_lista_de_items_con_dimension("3");
  }

  @Test
  public void test15_mostrar_primer_item() {
    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    
    // When pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And rotar pantalla
    robot.rotar_pantalla();

    // Then mostrar item con texto "A" y posicion "1" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("A", "1");
  }

  @Test
  public void test16_actualizar_primer_item() {
    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    
    // When pulsar boton de item
    robot.pulsar_boton_de_item();
    
    // Then mostrar item con texto "A" y posicion "2" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("A", "2");
  }

  @Test
  public void test17_mostrar_lista_de_items_por_actualizar_primer_item() {
    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    
    // When pulsar boton back
    robot.pulsar_boton_back();
    
    // Then mostrar item con texto "B" en posicion "1" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("B", "1");
    // And mostrar item con texto "A" en posicion "2" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("A", "2");
    // And mostrar item con texto "C" en posicion "3" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("C", "3");
    // And mostrar lista de items con dimension "3"
    robot.mostrar_lista_de_items_con_dimension("3");
  }

  @Test
  public void test18_mostrar_tercer_item() {

    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    
    // When pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    
    // Then mostrar item con texto "C" y posicion "3" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("C", "3");
  }

  @Test
  public void test19_actualizar_tercer_item() {
    

    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    
    // When pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And rotar pantalla
    robot.rotar_pantalla();

    // Then mostrar item con texto "C" y posicion "2" en lista de items
    robot.mostrar_item_con_texto_y_posicion_en_lista_de_items("C", "2");
  }

  @Test
  public void test20_mostrar_lista_de_items_por_actualizar_tercer_item() {
    
    // Given mostrar lista de items con dimension "0"
    robot.mostrar_lista_de_items_con_dimension("0");
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar boton de lista de items
    robot.pulsar_boton_de_lista_de_items();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "1" de lista
    robot.pulsar_item_en_posicion_de_lista("1");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton back
    robot.pulsar_boton_back();
    // And pulsar item en posicion "3" de lista
    robot.pulsar_item_en_posicion_de_lista("3");
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    // And pulsar boton de item
    robot.pulsar_boton_de_item();
    
    // When pulsar boton back
    robot.pulsar_boton_back();
    // And rotar pantalla
    robot.rotar_pantalla();

    // Then mostrar item con texto "A" en posicion "1" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("A", "1");
    // And mostrar item con texto "C" en posicion "2" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("C", "2");
    // And mostrar item con texto "B" en posicion "3" de lista
    robot.mostrar_item_con_texto_en_posicion_de_lista("B", "3");
    // And mostrar lista de items con dimension "3"
    robot.mostrar_lista_de_items_con_dimension("3");
  }

}
