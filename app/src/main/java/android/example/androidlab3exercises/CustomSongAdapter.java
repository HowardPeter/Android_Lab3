package android.example.androidlab3exercises;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomSongAdapter extends RecyclerView.Adapter<CustomSongAdapter.SongViewHolder>{
    ArrayList<Song> songList = new ArrayList<>();

    public CustomSongAdapter(ArrayList<Song> songList) {
        this.songList = songList;
    }

    @NonNull
    @Override
    public SongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_custom_song, null, false);
        return new SongViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SongViewHolder holder, int position) {
        Song song = songList.get(position);
        holder.imgSong.setImageResource(song.getIdImg());
        holder.tvSongName.setText(song.getName());
        holder.tvSinger.setText(song.getSinger());
        holder.tvYear.setText(String.valueOf(song.getYear()));
        holder.tvRank.setText(String.valueOf(song.getRank()));
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    public static class SongViewHolder extends RecyclerView.ViewHolder {
        ImageView imgSong;
        TextView tvSongName, tvSinger, tvYear, tvRank;

        public SongViewHolder(@NonNull View itemView) {
            super(itemView);
            imgSong = itemView.findViewById(R.id.imgSong);
            tvSongName = itemView.findViewById(R.id.tvSongName);
            tvSinger = itemView.findViewById(R.id.tvSinger);
            tvYear = itemView.findViewById(R.id.tvPublishYear);
            tvRank = itemView.findViewById(R.id.tvRank);
        }
    }
}
