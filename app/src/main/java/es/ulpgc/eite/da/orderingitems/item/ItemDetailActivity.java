package es.ulpgc.eite.da.orderingitems.item;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import es.ulpgc.eite.da.orderingitems.R;
import es.ulpgc.eite.da.orderingitems.data.ItemData;

;

public class ItemDetailActivity
    extends AppCompatActivity implements ItemDetailContract.View {

  public static String TAG = ItemDetailActivity.class.getSimpleName();

  private ItemDetailContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_item_detail);
    Toolbar toolbar = findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);
    getSupportActionBar().setTitle(R.string.detail_screen);

    // do the setup
    ItemDetailScreen.configure(this);

    if (savedInstanceState == null) {
      presenter.onStart();

    } else {
      presenter.onRestart();
    }
  }

  @Override
  protected void onResume() {
    super.onResume();

    // load the data
    presenter.onResume();
  }

  @Override
  public void onBackPressed() {
    super.onBackPressed();

    presenter.onBackPressed();
  }

  @Override
  protected void onPause() {
    super.onPause();

    presenter.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();

    presenter.onDestroy();
  }

  @Override
  public void onDataUpdated(ItemDetailViewModel viewModel) {
    Log.e(TAG, "onDataUpdated()");

    ItemData data = viewModel.data;
    String position = String.valueOf(data.position + 1);

    Log.e(TAG, "data: " + data);
    Log.e(TAG, "position: " + data.position);

    // deal with the data
    ((TextView) findViewById(R.id.itemText)).setText(data.letter);
    ((TextView) findViewById(R.id.posText)).setText(position);
  }


  public void onButtonTapped(View view) {
    presenter.onButtonTapped();
  }

  /*
  @Override
  public void navigateToPreviousScreen() {
    finish();
  }
  */

  @Override
  public void injectPresenter(ItemDetailContract.Presenter presenter) {
    this.presenter = presenter;
  }

}
