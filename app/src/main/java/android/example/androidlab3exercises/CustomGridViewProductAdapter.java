package android.example.androidlab3exercises;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGridViewProductAdapter extends BaseAdapter {
    Context context;
    ArrayList<Product> arrayList;
    public CustomGridViewProductAdapter(Context context, ArrayList<Product> arrayList) {
        this.context = context;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.layout_custom_product, null);
            holder = new ViewHolder();
            holder.imgProduct = (ImageView) convertView.findViewById(R.id.icProductCategory);
            holder.tvProductCategory = (TextView) convertView.findViewById(R.id.tvProdcutCategory);
            convertView.setTag(holder);
        } else {
            holder = (CustomGridViewProductAdapter.ViewHolder) convertView.getTag();
        }
        Product product = arrayList.get(position);
        holder.imgProduct.setImageResource(product.getIdImg());
        holder.tvProductCategory.setText(product.getProductCategory());

        return convertView;
    }
    static class ViewHolder{
        ImageView imgProduct;
        TextView tvProductCategory;
    }
}
