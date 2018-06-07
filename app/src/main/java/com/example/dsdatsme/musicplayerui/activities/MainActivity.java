package com.example.dsdatsme.musicplayerui.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dsdatsme.musicplayerui.R;
import com.example.dsdatsme.musicplayerui.utils.MusicAdapter;
import com.example.dsdatsme.musicplayerui.utils.MusicDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<MusicDatabase> musicList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MusicAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        mAdapter = new MusicAdapter(musicList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        prepareMusicData();

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

// set the adapter
        recyclerView.setAdapter(mAdapter);
    }

    private void prepareMusicData(){

        MusicDatabase music = new MusicDatabase("Jay Sean","BacK",5);
        musicList.add(music);
        music = new MusicDatabase("Jay Sean","BacK",5);
        musicList.add(music);
        music = new MusicDatabase("Jay Sean","BacK",5);
        musicList.add(music);
        music = new MusicDatabase("Jay Sean","BacK",5);
        musicList.add(music);
        music = new MusicDatabase("Jay Sean","BacK",5);
        musicList.add(music);
        music = new MusicDatabase("Jay Sean","BacK",5);
        musicList.add(music);
        mAdapter.notifyDataSetChanged();
    }
}

