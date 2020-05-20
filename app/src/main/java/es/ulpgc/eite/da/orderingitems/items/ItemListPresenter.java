package es.ulpgc.eite.da.orderingitems.items;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.orderingitems.data.ItemData;

public class ItemListPresenter implements ItemListContract.Presenter {

  public static String TAG = ItemListPresenter.class.getSimpleName();

  private WeakReference<ItemListContract.View> view;
  private ItemListState state;
  private ItemListContract.Model model;
  private ItemListContract.Router router;

  public ItemListPresenter(ItemListState state) {
    this.state = state;
  }

  @Override
  public void onStart() {
    // Log.e(TAG, "onStart()");

    // initialize the state if is necessary
    if (state == null) {
      state = new ItemListState();
    }

    //TODO: falta implementacion
  }

  @Override
  public void onRestart() {
    // Log.e(TAG, "onRestart()");

    //TODO: falta implementacion
  }

  @Override
  public void onResume() {
    // Log.e(TAG, "onResume()");

    //TODO: falta implementacion

  }

  @Override
  public void onBackPressed() {
    // Log.e(TAG, "onBackPressed()");
  }

  @Override
  public void onPause() {
    // Log.e(TAG, "onPause()");
  }

  @Override
  public void onDestroy() {
    // Log.e(TAG, "onDestroy()");
  }

  @Override
  public void onListTapped(ItemData data) {
    // Log.e(TAG, "onListTapped()");

    //TODO: falta implementacion
  }

  @Override
  public void onButtonTapped() {
    // Log.e(TAG, "onButtonTapped()");

    //TODO: falta implementacion
  }

  @Override
  public void injectView(WeakReference<ItemListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(ItemListContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(ItemListContract.Router router) {
    this.router = router;
  }
}
