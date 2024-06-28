package android.example.androidlab3exercises;

import java.util.ArrayList;

public class Product {
    int idImg;
    String productCategory;
    String productName;
    String productPrice;

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Product(int idImg, String productCategory, String productName, String productPrice) {
        this.idImg = idImg;
        this.productCategory = productCategory;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product(int idImg, String productCategory) {
        this.idImg = idImg;
        this.productCategory = productCategory;
    }

    public Product() {
    }

    public static ArrayList<Product> initGridData(int[] idImg, String[] productCategory)
    {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < idImg.length; i++) {
            Product product = new Product(idImg[i], productCategory[i]);
            products.add(product);
        }
        return products;
    }

    public static ArrayList<Product> initListViewData(int[] idImg, String[] productCategory, String[] productName, String[] productPrice)
    {
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < idImg.length; i++) {
            Product product = new Product(idImg[i], productCategory[i], productName[i], productPrice[i]);
            products.add(product);
        }
        return products;
    }
}
