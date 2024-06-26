package android.example.androidlab3exercises;

import java.util.ArrayList;

public class Language {
    int idImg;
    String languageName;

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Language(int idImg, String languageName) {
        this.idImg = idImg;
        this.languageName = languageName;
    }

    public Language() {
    }
    public  static ArrayList<Language> initData(int[] img, String[] name)
    {
        ArrayList<Language> arrayList = new ArrayList<>();
        for (int i = 0; i < img.length; i++) {
            Language lg = new Language(img[i], name[i]);
            arrayList.add(lg);
        }
        return arrayList;
    }
}
