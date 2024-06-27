package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class ActivityLab3Bai6 extends AppCompatActivity {
    Spinner spDanhMuc;
    EditText edtMaSp, edtTenSp;
    Button btnThem;
    ListView lvSp;

    ArrayList<String> spinnerList = new ArrayList<>();
    ArrayList<SanPhamMobile> lvArrayList = new ArrayList<>();
    ArrayAdapter<String> spinnerAdapter;
    ArrayAdapter<SanPhamMobile> lvAdapter;
    String[] lsDanhMuc = new String[]{"1 - Samsung", "2 - Iphone", "3 - Ipad"};
    int[] lsLoai = new int[]{1, 2, 2, 3, 3, 1};
    String[] lsMaSp = new String[]{"S1", "IP1", "IP2", "IP1", "IP2", "S2"};
    String[] lsTenSP = new String[]{"Samsung A6", "Iphone 13", "Iphone 14 Plus", "iPad Gen 10", "iPad Pro M4", "Samsung Galaxy Z Fold 5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai6);
        addControl();
        setUpSpinner();
        setUpListView();
    }
    void addControl()
    {
        spDanhMuc = (Spinner) findViewById(R.id.spDanhMuc);
        edtMaSp = (EditText) findViewById(R.id.edtMaSp);
        edtTenSp = (EditText) findViewById(R.id.edtTenSp);
        btnThem = (Button) findViewById(R.id.btnThem);
        lvSp = (ListView) findViewById(R.id.lvSp);
    }
    void setUpSpinner()
    {
        for (int i = 0; i < lsDanhMuc.length; i++) {
            spinnerList.add(lsDanhMuc[i]);
        }
        spinnerAdapter = new ArrayAdapter<>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item, spinnerList);
        spDanhMuc.setAdapter(spinnerAdapter);
    }
    void setUpListView()
    {
        lvArrayList = SanPhamMobile.initData(lsLoai, lsMaSp, lsTenSP);
        lvAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, lvArrayList);
        lvSp.setAdapter(lvAdapter);
    }
}