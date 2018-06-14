package com.example.dsdatsme.musicplayerui.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dsdatsme.musicplayerui.R;
import com.example.dsdatsme.musicplayerui.activities.PlayerActivity;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {

    private List<MusicDatabase> musicList;
    private Context context;

    //Constructor of This class
    public MusicAdapter(List<MusicDatabase> musicList, Context context) {
        this.musicList = musicList;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final MusicDatabase music = musicList.get(position);
        holder.songName.setText(music.getSong());
        holder.artist.setText(music.getArtist());
        holder.albumArt.setImageResource(music.getAlbumArt());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent(context, PlayerActivity.class);
                explicitIntent.putExtra("ArtistName", music.getArtist());
                explicitIntent.putExtra("SongName", music.getSong());
                //explicitIntent.putExtra("SongURI",music.getSong_URI());
                explicitIntent.putExtra("AlbumArt",music.getAlbumArt());
                context.startActivity(explicitIntent);
            }
        });

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView songName, artist;
        private ImageView albumArt;
        private RelativeLayout relativeLayout;
        //private ImageView albumArt;
        private MyViewHolder(View view) {
            super(view);
            relativeLayout = (RelativeLayout) view.findViewById(R.id.relative_layout);
            songName = (TextView) view.findViewById(R.id.song_name_text_view);
            artist = (TextView) view.findViewById(R.id.artist_text_view);
            albumArt = (ImageView) view.findViewById(R.id.album_art);
        }
    }
}


