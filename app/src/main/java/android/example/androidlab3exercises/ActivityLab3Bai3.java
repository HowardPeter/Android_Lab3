package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityLab3Bai3 extends AppCompatActivity {
    RecyclerView rvMovies;
    ArrayList<Movie> arrayListMovie = new ArrayList<>();
    CustomAdapterRecycleViewMovies movieAdapter;

//    String[] lsTitle = new String[]{"The Shawshank Redemption","The Godfather","The Dark Knight","Pulp Fiction","The Lord of the Rings: The Return of the King","Forrest Gump"};
//    String[] lsGenre = new String[]{"Drama","Crime", "Action", "Crime", "Fantasy", "Drama"};
//    String[] lsYear = new String[]{"1994", "1972", "2008", "1994", "2003", "1994"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai3);

        rvMovies = (RecyclerView) findViewById(R.id.rVMovies);
        movieAdapter = new CustomAdapterRecycleViewMovies(arrayListMovie);
        rvMovies.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, true);
        rvMovies.setLayoutManager(layoutManager);
        rvMovies.setItemAnimator(new DefaultItemAnimator());
        rvMovies.setAdapter(movieAdapter);
        initData();
    }

    void initData()
    {
        Movie movie = new Movie("The Shawshank Redemption", "Drama", "1994");
        arrayListMovie.add(movie);
        movie = new Movie("The Godfather", "Crime", "1972");
        arrayListMovie.add(movie);
        movie = new Movie("The Dark Knight", "Action", "2008");
        arrayListMovie.add(movie);
    }
}