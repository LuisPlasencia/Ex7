package es.ulpgc.eite.da.orderingitems.item;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.orderingitems.R;
import es.ulpgc.eite.da.orderingitems.app.AppMediator;

public class ItemDetailScreen {

  public static void configure(ItemDetailContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    AppMediator mediator = AppMediator.getInstance();
    ItemDetailState state = mediator.getItemDetailState();

    ItemDetailContract.Router router = new ItemDetailRouter(mediator);
    ItemDetailContract.Presenter presenter = new ItemDetailPresenter(state);
    ItemDetailContract.Model model = new ItemDetailModel();
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
