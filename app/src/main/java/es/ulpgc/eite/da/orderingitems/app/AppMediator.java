package es.ulpgc.eite.da.orderingitems.app;

import es.ulpgc.eite.da.orderingitems.item.ItemDetailState;
import es.ulpgc.eite.da.orderingitems.items.ItemListState;

public class AppMediator {

  private static AppMediator instance;


  private ItemDetailState itemDetailState;
  private ItemListState itemListState;


  private AppMediator() {
    itemDetailState= new ItemDetailState();
    itemListState = new ItemListState();
  }

  public static AppMediator getInstance() {
    if(instance == null){
      instance = new AppMediator();
    }

    return instance;
  }

  public static void resetInstance() {
    instance = null;
  }


  public ItemDetailState getItemDetailState() {
    return itemDetailState;
  }


  public ItemListState getItemListState() {
    return itemListState;
  }

}
