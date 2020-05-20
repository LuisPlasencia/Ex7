package es.ulpgc.eite.da.orderingitems.items;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.da.orderingitems.data.ItemData;

public class ItemListModel implements ItemListContract.Model {

  public static String TAG = ItemListModel.class.getSimpleName();


  private String[] letters = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
      "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


  private List<ItemData> dataSource;
  private Integer dataIndex;

  public ItemListModel() {
    dataIndex = 0;
    dataSource = new ArrayList();
  }

  @Override
  public List<ItemData> getStoredDataSource() {
    // Log.e(TAG, "getStoredDataSource()");
    return dataSource;
  }


  @Override
  public Integer getStoredIndex() {
    return dataIndex;
  }

  @Override
  public void onRestartScreen(List<ItemData> datasource, Integer index) {
    // Log.e(TAG, "onRestartScreen()");

    this.dataSource =datasource;
    this.dataIndex =index;
  }

  @Override
  public void onAddNewData() {
    //TODO: falta implementacion
  }


  @Override
  public void onDataFromNextScreen(ItemData data, Integer clicks) {
    // Log.e(TAG, "onDataFromNextScreen()");

    //TODO: falta implementacion

  }

}
