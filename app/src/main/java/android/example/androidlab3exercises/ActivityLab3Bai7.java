package android.example.androidlab3exercises;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ActivityLab3Bai7 extends AppCompatActivity {
    RecyclerView rvSongs;
    ArrayList<Song> songArrayList = new ArrayList<>();
    CustomSongAdapter songAdapter;
    int[] lsImg = new int[]{R.drawable.vivalavida, R.drawable.chericherilady, R.drawable.shapeofyou, R.drawable.beatit, R.drawable.countingstars};
    String[] lsName = new String[]{"Viva la Vida", "Cheri cheri lady", "Shape of you", "Beat it", "Counting stars"};
    String[] lsSinger = new String[]{"Coldplay", "Modern Talking", "Ed Sheeran", "Michael Jackson", "OneRepublic"};
    int[] lsYear = new int[]{2008, 1985, 2017, 1982, 2013};
    int[] lsRank = new int[]{1, 2, 3, 4, 5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_bai7);
        rvSongs = (RecyclerView) findViewById(R.id.rvSongs);

        songArrayList = Song.initData(lsImg, lsName, lsSinger, lsYear, lsRank);
        songAdapter = new CustomSongAdapter(songArrayList);
        rvSongs.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvSongs.setLayoutManager(layoutManager);
        rvSongs.setItemAnimator(new DefaultItemAnimator());
        rvSongs.setAdapter(songAdapter);
    }
}