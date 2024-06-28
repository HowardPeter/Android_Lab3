package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ActivityLab3Bai6 extends AppCompatActivity {
    Spinner spDanhMuc;
    EditText edtMaSp, edtTenSp;
    Button btnThem;
    ListView lvSp;

    ArrayList<String> spinnerList = new ArrayList<>();
    ArrayList<SanPhamMobile> lvArrayList = new ArrayList<>(); // List hiển thị lên màn hình
    ArrayList<SanPhamMobile> allSanPham = new ArrayList<>(); // List chứa tất cả sản phẩm
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
        addEvent();
        filterProductsByCategory(1);
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
        allSanPham = SanPhamMobile.initData(lsLoai, lsMaSp, lsTenSP);
        lvAdapter = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, lvArrayList);
        lvSp.setAdapter(lvAdapter);
    }
    void addEvent()
    {
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String danhmuc = spDanhMuc.getSelectedItem().toString().substring(0, 1); //lấy giá trị đầu của chuỗi selected spinner item
                int loai = Integer.parseInt(danhmuc);
                String masp = edtMaSp.getText().toString();
                String tensp = edtTenSp.getText().toString();
                if(!masp.isEmpty() || !tensp.isEmpty())
                {
                    SanPhamMobile sanPhamMobile = new SanPhamMobile(loai, masp, tensp);
                    allSanPham.add(sanPhamMobile); // thêm vào list tất cả sản phẩm
                }
                filterProductsByCategory(loai);
                lvAdapter.notifyDataSetChanged();

                edtMaSp.setText("");
                edtTenSp.setText("");
            }
        });
        spDanhMuc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // lấy giá trị số ở đầu chuỗi selected spinner item và chuyển thành int
                int selectedCategory = Integer.parseInt(parent.getItemAtPosition(position).toString().substring(0, 1));
                filterProductsByCategory(selectedCategory);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                lvAdapter.clear();
                lvAdapter.notifyDataSetChanged();
            }
        });
    }
    void filterProductsByCategory(int category) {
        lvArrayList.clear();
        lvArrayList.addAll(allSanPham.stream()
                .filter(product -> product.getLoaiSp() == category)
                .collect(Collectors.toList()));
        lvAdapter.notifyDataSetChanged();
    }
}