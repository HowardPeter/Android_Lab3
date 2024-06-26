package android.example.androidlab3exercises;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomGridFruitAdapter extends BaseAdapter {
    ArrayList<Fruit> arrayListFruit = new ArrayList<>();
    LayoutInflater layoutInflater;
    Context context;

    public CustomGridFruitAdapter(Context context, ArrayList<Fruit> arrayListFruit) {
        this.arrayListFruit = arrayListFruit;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayListFruit.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayListFruit.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.grid_item_layout, null);
            holder = new ViewHolder();
            holder.fruitView = (ImageView) convertView.findViewById(R.id.imgGFruit);
            holder.fruitNameView = (TextView) convertView.findViewById(R.id.tvGName);
            holder.priceView = (TextView) convertView.findViewById(R.id.tvGPrice);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Fruit fr = arrayListFruit.get(position);
        holder.fruitNameView.setText(fr.getName());
        holder.priceView.setText(String.valueOf(fr.getPrice()));
        holder.fruitView.setImageResource(fr.getIdImg());
        return convertView;
    }

    // Hàm trả về giá trị int
//    public int getMipmapResIdByName(String resName){
//        String pkgName = context.getPackageName(); // Return 0 if not found.
//        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
//        Log.i("CustomGridView", "Res Name: "+ resName+"==> Res ID = "+ resID);
//        return resID;
//    }
    static class ViewHolder
    {
        ImageView fruitView;
        TextView fruitNameView;
        TextView priceView;
    }
}
