package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductList extends AppCompatActivity {
    ListView lvProducts;
    ArrayList<Product> allProductList = new ArrayList<>();
    ArrayList<Product> selectedList = new ArrayList<>();
    ArrayAdapter<Product> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        lvProducts = (ListView) findViewById(R.id.lvProducts);
        adapter = new ArrayAdapter<>(ProductList.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, selectedList);

    }
    void filterToDisplay()
    {
        Intent intent = getIntent();
        String category = intent.getStringExtra("Category");
    }
}