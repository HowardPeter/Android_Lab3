package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ActivityLab3Bai4 extends AppCompatActivity {
    GridView gvFruit;
    ArrayList<Fruit> fruitArrayList = new ArrayList<>();
    CustomGridFruitAdapter adapter;

    int[] lsIdImg = new int[]{R.drawable.apple,R.drawable.banana, R.drawable.strawberry, R.drawable.mango,R.drawable.pineapple};
    String[] lsName= new String[]{"Táo","Chuối","Dâu","Xoài","Thơm"};
    int[] lsPrice = new int[]{100,12,80,20,30};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai4);
        gvFruit = (GridView) findViewById(R.id.gVFruit);
        fruitArrayList = Fruit.initArrayListFruit(lsIdImg, lsName, lsPrice);
        adapter = new CustomGridFruitAdapter(this, fruitArrayList);
        gvFruit.setAdapter(adapter);

        gvFruit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object o = gvFruit.getItemAtPosition(position);
                Fruit fruit = (Fruit) o;
                Toast.makeText(ActivityLab3Bai4.this, "Selected :" + " " + fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}