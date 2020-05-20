package es.ulpgc.eite.da.orderingitems.items;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.orderingitems.R;
import es.ulpgc.eite.da.orderingitems.app.AppMediator;

public class ItemListScreen {

  public static void configure(ItemListContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);


    AppMediator mediator = AppMediator.getInstance();
    ItemListState state = mediator.getItemListState();

    ItemListContract.Router router = new ItemListRouter(mediator);
    ItemListContract.Presenter presenter = new ItemListPresenter(state);
    ItemListContract.Model model = new ItemListModel();
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
