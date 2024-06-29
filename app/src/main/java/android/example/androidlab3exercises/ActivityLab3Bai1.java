package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivityLab3Bai1 extends AppCompatActivity {
    Spinner spDanhMuc;
    ArrayList<String> dataSP = new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai1);

        spDanhMuc = (Spinner) findViewById(R.id.spDanhMuc);
        initData();

        adapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, dataSP);
        spDanhMuc.setAdapter(adapter);

        spDanhMuc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),dataSP.get(position), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    void initData()
    {
        dataSP.add("James Smith - (Receptionist)");
        dataSP.add("Michael Garcia – (CEO)");
        dataSP.add("Robert Johnson – (Professional Staff)");
    }

}