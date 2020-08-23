package com.example.netology;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ItemsAdapter extends BaseAdapter {

    private List<Items> items;
    private Context context;
    private LayoutInflater inflater;

    private CompoundButton.OnCheckedChangeListener myCheckChangeList
            = new CompoundButton.OnCheckedChangeListener() {
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            items.get((Integer) buttonView.getTag()).setChecked(isChecked);
        }
    };

    public ItemsAdapter(Context context, List<Items> items) {
        if (items == null) {
            this.items = new ArrayList<>();
        } else {
            this.items = items;
        }
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Items getItem(int position) {
        if (position < items.size()) {
            return items.get(position);
        } else {
            return null;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.item_list, parent, false);
        }

        Items itemData = items.get(position);

        ImageView image = view.findViewById(R.id.imageView);
        TextView title = view.findViewById(R.id.textViewTitle);
        TextView subtitle = view.findViewById(R.id.textViewSubtitle);
        CheckBox checkBox = view.findViewById(R.id.checkBox);

        image.setImageResource(itemData.getImage());
        title.setText(itemData.getTitle());
        subtitle.setText(itemData.getSubtitle());
        checkBox.setOnCheckedChangeListener(myCheckChangeList);
        checkBox.setTag(position);
        checkBox.setChecked(itemData.isChecked());


        return view;
    }
}
