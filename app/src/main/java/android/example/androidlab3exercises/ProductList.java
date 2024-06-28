package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ProductList extends AppCompatActivity {
    ListView lvProducts;
    ArrayList<Product> allProduct = new ArrayList<>();
    ArrayList<Product> selectedList = new ArrayList<>();
    ArrayAdapter<Product> adapter;

    int[] lsIcon = new int[]{
            R.drawable.car, R.drawable.car, R.drawable.car,     // Car & Bikes
            R.drawable.mobilephone, R.drawable.mobilephone, R.drawable.mobilephone, // Mobiles & Tablets
            R.drawable.computer, R.drawable.computer, R.drawable.computer, // Electronics & Appliances
            R.drawable.estate, R.drawable.estate, R.drawable.estate, // Real Estate
            R.drawable.home, R.drawable.home, R.drawable.home, // Home & Lifestyle
            R.drawable.job, R.drawable.job, R.drawable.job, // Job
            R.drawable.service, R.drawable.service, R.drawable.service, // Services
            R.drawable.movie, R.drawable.movie, R.drawable.movie, // Entertainment
            R.drawable.education, R.drawable.education, R.drawable.education // Education & Learning
    };

    String[] lsName = new String[]{
            "Honda Civic", "Yamaha R15", "Toyota Corolla",          // Car & Bikes
            "Samsung Galaxy S21", "iPhone 12", "OnePlus 9",         // Mobiles & Tablets
            "Sony 55\" 4K TV", "LG Refrigerator", "HP Laptop",      // Electronics & Appliances
            "3 BHK Apartment", "2 BHK Villa", "Office Space",       // Real Estate
            "Sofa Set", "Dining Table", "Queen Bed",                // Home & Lifestyle
            "Software Engineer", "Data Scientist", "Project Manager", // Job
            "Plumbing Service", "Cleaning Service", "Electrical Repair", // Services
            "Movie Tickets", "Concert Tickets", "Museum Entry",     // Entertainment
            "Online Course", "Private Tutor", "Workshop"            // Education & Learning
    };

    String[] lsCategory = new String[]{
            "Car & Bikes", "Car & Bikes", "Car & Bikes",             // Car & Bikes
            "Mobiles & Tablets", "Mobiles & Tablets", "Mobiles & Tablets", // Mobiles & Tablets
            "Electronics & Appliances", "Electronics & Appliances", "Electronics & Appliances", // Electronics & Appliances
            "Real Estate", "Real Estate", "Real Estate",             // Real Estate
            "Home & Lifestyle", "Home & Lifestyle", "Home & Lifestyle", // Home & Lifestyle
            "Job", "Job", "Job",                                      // Job
            "Services", "Services", "Services",                       // Services
            "Entertainment", "Entertainment", "Entertainment",       // Entertainment
            "Education & Learning", "Education & Learning", "Education & Learning" // Education & Learning
    };

    int[] lsPrice = new int[]{
            25000, 15000, 22000,  // Prices for Car & Bikes
            799, 999, 699,        // Prices for Mobiles & Tablets
            1200, 800, 1000,      // Prices for Electronics & Appliances
            150000, 200000, 50000,// Prices for Real Estate
            500, 300, 700,        // Prices for Home & Lifestyle
            60000, 80000, 90000,  // Salaries for Job
            50, 30, 40,           // Prices for Services
            10, 50, 20,           // Prices for Entertainment
            100, 200, 150         // Prices for Education & Learning
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        lvProducts = (ListView) findViewById(R.id.lvProducts);
        adapter = new ArrayAdapter<>(ProductList.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, selectedList);

        Intent intent = getIntent();
        String category = intent.getStringExtra("Category");
        selectedList = getProductsByCategory(category);
        adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, selectedList);
        lvProducts.setAdapter(adapter);
    }
    ArrayList<Product> getProductsByCategory(String category) {
        ArrayList<Product> selectedProducts = new ArrayList<>();

        // lọc các product theo category
        allProduct = Product.initListViewData(lsIcon, lsCategory, lsName, lsPrice);
        selectedProducts.addAll(allProduct.stream()
                .filter(product -> product.getProductCategory().equals(category))
                .collect(Collectors.toList()));

        return selectedProducts;
    }
}