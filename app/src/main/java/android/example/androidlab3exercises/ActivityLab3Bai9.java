package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class ActivityLab3Bai9 extends AppCompatActivity {
    GridView gvProduct;
    ArrayList<Product> productArrayList = new ArrayList<>();
    CustomGridViewProductAdapter productAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai9);
        gvProduct = (GridView) findViewById(R.id.gvProduct);
        setUpGridView();

        gvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ActivityLab3Bai9.this, ProductList.class);
                Product product = (Product) parent.getItemAtPosition(position);
                intent.putExtra("Category", product.getProductCategory());
                startActivity(intent);
            }
        });
    }
    void setUpGridView()
    {
        int[] icProduct = new int[]{R.drawable.car, R.drawable.mobilephone, R.drawable.computer, R.drawable.estate, R.drawable.home, R.drawable.job, R.drawable.service, R.drawable.movie, R.drawable.education};
        String[] lsCategory = new String[]{"Car & Bikes", "Mobiles & Tablets", "Electronics & Appliances", "Real Estate", "Home & Lifestyle", "Job", "Services", "Entertainment", "Education & Learning"};
        productArrayList = Product.initGridData(icProduct, lsCategory);
        productAdapter = new CustomGridViewProductAdapter(ActivityLab3Bai9.this, productArrayList);
        gvProduct.setAdapter(productAdapter);
    }
}