package android.example.androidlab3exercises;

import java.util.ArrayList;

public class Song {
    int idImg;
    String name;
    String singer;
    int year;
    int rank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public Song(int idImg, String name, String singer, int year, int rank) {
        this.name = name;
        this.singer = singer;
        this.year = year;
        this.rank = rank;
        this.idImg = idImg;
    }

    public Song() {
    }

    public static ArrayList<Song> initData(int[] img, String[] name, String[] singer, int[] year, int[] rank)
    {
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i < img.length; i++) {
            Song song = new Song(img[i], name[i], singer[i], year[i], rank[i]);
            songs.add(song);
        }
        return songs;
    }
}

