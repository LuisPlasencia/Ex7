package es.ulpgc.eite.da.orderingitems.items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import es.ulpgc.eite.da.orderingitems.R;
import es.ulpgc.eite.da.orderingitems.data.ItemData;


public class ItemListAdapter extends ArrayAdapter<ItemData> {

  private final List<ItemData> itemList;
  private final View.OnClickListener clickListener;


  public ItemListAdapter(
      Context ctx, List<ItemData> items, View.OnClickListener listener) {

    super(ctx, 0, items);

    itemList = items;
    clickListener = listener;
  }


  @Override
  public int getCount() {
    return itemList.size();
  }

  @Override
  public ItemData getItem(int position) {
    return itemList.get(position);
  }


  @Override
  public long getItemId(int position) {
    return getItem(position).id;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View itemView = convertView;

    if (itemView == null) {
      itemView = LayoutInflater
          .from(parent.getContext())
          .inflate(R.layout.content_list_item, parent, false);
    }

    itemView.setTag(itemList.get(position));
    itemView.setOnClickListener(clickListener);

    final TextView titleView = itemView.findViewById(R.id.itemTitle);
    ItemData data = itemList.get(position);
    titleView.setText(String.valueOf(data.letter));

    return itemView;
  }


}
