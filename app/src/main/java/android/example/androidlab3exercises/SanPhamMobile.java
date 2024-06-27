package android.example.androidlab3exercises;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class SanPhamMobile {
    int loaiSp;
    String maSp;
    String tenSp;

    public int getLoaiSp() {
        return loaiSp;
    }

    public void setLoaiSp(int loaiSp) {
        this.loaiSp = loaiSp;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public SanPhamMobile(int loaiSp, String maSp, String tenSp) {
        this.loaiSp = loaiSp;
        this.maSp = maSp;
        this.tenSp = tenSp;
    }

    public SanPhamMobile() {
    }

    public static ArrayList<SanPhamMobile> initData(int[] loai, String[] ma, String[] ten){
        ArrayList<SanPhamMobile> spham = new ArrayList<>();
        for (int i = 0; i < loai.length; i++) {
            SanPhamMobile sp = new SanPhamMobile(loai[i], ma[i], ten[i]);
            spham.add(sp);
        }
        return spham;
    }

    @NonNull
    @Override
    public String toString() {
        return maSp + " - " + tenSp;
    }
}
