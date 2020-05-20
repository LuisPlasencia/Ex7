package es.ulpgc.eite.da.orderingitems.items;

import java.lang.ref.WeakReference;
import java.util.List;

import es.ulpgc.eite.da.orderingitems.app.DetailToListState;
import es.ulpgc.eite.da.orderingitems.app.ListToDetailState;
import es.ulpgc.eite.da.orderingitems.data.ItemData;

public interface ItemListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(ItemListViewModel viewModel);

    void navigateToNextScreen();
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void onResume();

    void onStart();

    void onRestart();

    void onBackPressed();

    void onPause();

    void onDestroy();

    void onListTapped(ItemData data);

    void onButtonTapped();
  }

  interface Model {
    List<ItemData> getStoredDataSource();

    void onDataFromNextScreen(ItemData data, Integer clicks);

    void onRestartScreen(List<ItemData> datasource, Integer index);

    void onAddNewData();

    Integer getStoredIndex();
  }

  interface Router {

    DetailToListState getStateFromNextScreen();

    void passStateToNextScreen(ListToDetailState state);

  }
}
