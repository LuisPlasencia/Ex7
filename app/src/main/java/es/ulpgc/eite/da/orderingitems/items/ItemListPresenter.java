package es.ulpgc.eite.da.orderingitems.items;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.orderingitems.app.DetailToListState;
import es.ulpgc.eite.da.orderingitems.app.ListToDetailState;
import es.ulpgc.eite.da.orderingitems.data.ItemData;
import java.util.Collections;

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
    model.onRestartScreen(state.dataSource, state.dataIndex);
  }

  @Override
  public void onResume() {
    // Log.e(TAG, "onResume()");
    DetailToListState detailToListState = router.getStateFromNextScreen();
    if(detailToListState !=null){
      model.onDataFromNextScreen(detailToListState.letra, detailToListState.numOfClicks );
    }

    state.dataIndex = model.getStoredIndex();
    state.dataSource = model.getStoredDataSource();
    state.numOfClicks = model.getStoredNumOfClicks();
    state.letraClickada = model.getStoredLetra();
    Log.d("hola", String.valueOf(state.dataIndex));

    if(state.numOfClicks != 0) {
      Collections.rotate(state.dataSource, state.numOfClicks);
      for (int i = 0; i < state.dataSource.size(); i++) {
        state.dataSource.get(i).position = i;
      }
    }


    view.get().onDataUpdated(state);

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
    ListToDetailState listToDetailState = new ListToDetailState();
    state.letraClickada = data;
    listToDetailState.letra = data;
    listToDetailState.listSize = state.dataIndex;
    router.passStateToNextScreen(listToDetailState);
    view.get().navigateToNextScreen();
  }

  @Override
  public void onButtonTapped() {
    // Log.e(TAG, "onButtonTapped()");
    model.onAddNewData();
    state.dataSource = model.getStoredDataSource();
    state.dataIndex++;
    view.get().onDataUpdated(state);
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
