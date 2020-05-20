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
  private ItemData itemData;
  private Integer clicks;

  public ItemListModel() {
    clicks = 0;
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
  public Integer getStoredNumOfClicks() {
    int clicks = this.clicks;
    this.clicks = 0;
    return clicks;
  }

  @Override
  public ItemData getStoredLetra() {
    return itemData;
  }

  @Override
  public void onRestartScreen(List<ItemData> datasource, Integer index) {
    // Log.e(TAG, "onRestartScreen()");

    this.dataSource =datasource;
    this.dataIndex =index;
  }

  @Override
  public void onAddNewData() {
    ItemData itemData = new ItemData( letters[dataIndex] , dataIndex);
    dataIndex = dataIndex+1;
    dataSource.add(itemData);

  }


  @Override
  public void onDataFromNextScreen(ItemData data, Integer clicks) {
    // Log.e(TAG, "onDataFromNextScreen()");
    this.itemData = data;
    this.clicks = clicks;

  }

}
