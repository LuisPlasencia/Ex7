package es.ulpgc.eite.da.orderingitems.item;

import es.ulpgc.eite.da.orderingitems.data.ItemData;

public class ItemDetailModel implements ItemDetailContract.Model {

  public static String TAG = ItemDetailModel.class.getSimpleName();

  private ItemData data;
  private Integer listSize;

  public ItemDetailModel() {

  }

  @Override
  public ItemData getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public void onRestartScreen(ItemData data, Integer size) {
    // Log.e(TAG, "onRestartScreen()");

    this.data=data;
    this.listSize =size;
  }

  @Override
  public void onDataFromPreviousScreen(ItemData data, Integer size) {
    // Log.e(TAG, "onDataFromPreviousScreen()");

    this.data=data;
    this.listSize =size;
  }

  @Override
  public void onIncrPosition() {

    //TODO: falta implementacion
  }
}
