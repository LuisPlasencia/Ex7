package es.ulpgc.eite.da.orderingitems.item;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.orderingitems.app.DetailToListState;
import es.ulpgc.eite.da.orderingitems.app.ListToDetailState;
import es.ulpgc.eite.da.orderingitems.data.ItemData;

public interface ItemDetailContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(ItemDetailViewModel viewModel);

    //void navigateToPreviousScreen();
  }

  interface Presenter {
    void onButtonTapped();

    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void onResume();

    void onStart();

    void onRestart();

    void onBackPressed();

    void onPause();

    void onDestroy();
  }

  interface Model {
    ItemData getStoredData();

    void onRestartScreen(ItemData data, Integer size);

    void onDataFromPreviousScreen(ItemData data, Integer size);

    void onIncrPosition();
  }

  interface Router {

    void passStateToPreviousScreen(DetailToListState state);

    ListToDetailState getStateFromPreviousScreen();
  }
}
