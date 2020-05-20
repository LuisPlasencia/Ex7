package es.ulpgc.eite.da.orderingitems.item;

import java.lang.ref.WeakReference;

public class ItemDetailPresenter implements ItemDetailContract.Presenter {

  public static String TAG = ItemDetailPresenter.class.getSimpleName();

  private WeakReference<ItemDetailContract.View> view;
  private ItemDetailState state;
  private ItemDetailContract.Model model;
  private ItemDetailContract.Router router;

  public ItemDetailPresenter(ItemDetailState state) {
    this.state = state;
  }

  @Override
  public void onStart() {
    // Log.e(TAG, "onStart()");

    // initialize the state if is necessary
    if (state == null) {
      state = new ItemDetailState();
    }

    state.numOfClicks=0;

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

    //TODO: falta implementacion
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
  public void onButtonTapped() {
    // Log.e(TAG, "onButtonTapped()");

    //TODO: falta implementacion
  }

  @Override
  public void injectView(WeakReference<ItemDetailContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(ItemDetailContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(ItemDetailContract.Router router) {
    this.router = router;
  }
}
