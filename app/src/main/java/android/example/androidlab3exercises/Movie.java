package android.example.androidlab3exercises;

import java.util.ArrayList;

public class Movie {
    String title, genre, year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Movie() {
    }

    public Movie(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

//    public static ArrayList<Movie> initMovie(String[] title, String[] genre, String[] year)
//    {
//        ArrayList<Movie> arrayList = new ArrayList<>();
//        for (int i = 0; i < title.length; i++) {
//            Movie movie = new Movie(title[i], genre[i], year[i]);
//            arrayList.add(movie);
//        }
//        return arrayList;
//    }
}
