package com.example.dsdatsme.musicplayerui.utils;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dsdatsme.musicplayerui.R;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MyViewHolder> {

    private List<MusicDatabase> musicList;

    public MusicAdapter(List<MusicDatabase> items, MyOnClickListener listener) {

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView songName, artist;

        private MyViewHolder(View view) {
            super(view);
            songName = (TextView) view.findViewById(R.id.song_name_text_view);
            artist = (TextView) view.findViewById(R.id.artist_text_view);
        }
    }

    public MusicAdapter(List<MusicDatabase> musicList){
        this.musicList = musicList;
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }
    private final View.OnClickListener mOnClickListener = new MyOnClickListener();

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        itemView.setOnClickListener(mOnClickListener);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MusicDatabase music = musicList.get(position);
        holder.songName.setText(music.getSong());
        holder.artist.setText(music.getArtist());

    }




}


