package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityLab3Bai4bai8 extends AppCompatActivity {
    GridView gvFruit;
    ArrayList<Fruit> fruitArrayList = new ArrayList<>();
    CustomGridFruitAdapter adapter;

    int[] lsIdImg = new int[]{R.drawable.apple,R.drawable.banana, R.drawable.strawberry, R.drawable.mango,R.drawable.pineapple};
    String[] lsName= new String[]{"Táo","Chuối","Dâu","Xoài","Thơm"};
    int[] lsPrice = new int[]{100,12,80,20,30};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai4bai8);
        gvFruit = (GridView) findViewById(R.id.gVFruit);
        fruitArrayList = Fruit.initArrayListFruit(lsIdImg, lsName, lsPrice);
        adapter = new CustomGridFruitAdapter(this, fruitArrayList);
        gvFruit.setAdapter(adapter);
        addEvent();
    }
    void addEvent()
    {
        gvFruit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                adapter.setSelectedPosition(position);
            }
        });

    }
}