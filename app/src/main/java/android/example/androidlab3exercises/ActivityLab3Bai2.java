package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

public class ActivityLab3Bai2 extends AppCompatActivity {
    Spinner spTraiCay;
    ArrayList<Fruit> fruitArrayList = new ArrayList<>();
    CustomSpinnerAdapterFruit adapterFruit;

    int[] lsIdImg = new int[]{R.drawable.apple,R.drawable.banana, R.drawable.strawberry, R.drawable.mango,R.drawable.pineapple};
    String[]lsName= new String[]{"Táo","Chuối","Dâu","Xoài","Thơm"};
    int[]lsPrice = new int[]{100,12,80,20,30};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai2);

        spTraiCay = (Spinner) findViewById(R.id.spTraiCay);
        fruitArrayList = Fruit.initArrayListFruit(lsIdImg, lsName, lsPrice);
        adapterFruit = new CustomSpinnerAdapterFruit(this, R.layout.layout_custom_fruit, fruitArrayList);
        spTraiCay.setAdapter(adapterFruit);
    }
}