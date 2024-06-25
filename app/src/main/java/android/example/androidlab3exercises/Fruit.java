package android.example.androidlab3exercises;

import java.util.ArrayList;

public class Fruit {
    int idImg;
    String name;
    int price;

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Fruit() {
    }

    public Fruit(int idImg, String name, int price) {
        this.idImg = idImg;
        this.name = name;
        this.price = price;
    }

    public static ArrayList<Fruit> initArrayListFruit(int[] lsImg, String[] lsName, int[] lsPrice)
    {
        ArrayList<Fruit> fruitArrayList = new ArrayList<>();
        for (int i = 0; i < lsImg.length; i++) {
            Fruit fr = new Fruit(lsImg[i], lsName[i], lsPrice[i]);
            fruitArrayList.add(fr);
        }
        return fruitArrayList;
    }
}
