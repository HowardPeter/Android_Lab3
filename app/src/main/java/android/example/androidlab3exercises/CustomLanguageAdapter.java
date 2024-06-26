package android.example.androidlab3exercises;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomLanguageAdapter extends BaseAdapter {
    ArrayList<Language> arrayList = new ArrayList<>();
    LayoutInflater layoutInflater;
    int layoutItem;

    public CustomLanguageAdapter(Activity context, int layoutItem, ArrayList<Language> arrayList) {
        this.layoutInflater = context.getLayoutInflater();
        this.arrayList = arrayList;
        this.layoutItem = layoutItem;
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

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Language lg = arrayList.get(position);
        View rowView = layoutInflater.inflate(layoutItem, null,true);

        TextView tvLanguage = rowView.findViewById(R.id.tvLanguage);
        tvLanguage.setText(lg.getLanguageName());

        ImageView imgLanguage = rowView.findViewById(R.id.imgLanguage);
        imgLanguage.setImageResource(lg.getIdImg());

        return rowView;
    }
}
