package android.example.androidlab3exercises;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomSpinnerAdapterFruit extends BaseAdapter {
    LayoutInflater layoutInflater;
    ArrayList<Fruit> arrayList = new ArrayList<>();
    int layoutItem;

    public CustomSpinnerAdapterFruit(Activity context, int layoutItem, ArrayList<Fruit> arrayList) {
        this.layoutInflater = context.getLayoutInflater();
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Fruit fruit = arrayList.get(position);
        View rowView = layoutInflater.inflate(layoutItem,null,true);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imgFruit);
        imageView.setImageResource(fruit.getIdImg());

        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);
        tvName.setText(fruit.getName());

        TextView tvPrice = (TextView) rowView.findViewById(R.id.tvPrice);
        tvPrice.setText(String.valueOf(fruit.getPrice()));

        return rowView;
    }
}
