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

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new MusicAdapter(musicList, getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        prepareMusicData();

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        // set the adapter
        recyclerView.setAdapter(mAdapter);
    }

    // URI is for future prposes if you want to add song url
    private void prepareMusicData() {
        MusicDatabase music = new MusicDatabase("Jay Sean", "Back To Love", 5,R.drawable.back_to_love_album_art);
        musicList.add(music);
        music = new MusicDatabase("One Direction", "Story of My Life", 5,R.drawable.story_of_my_life_album_art);
        musicList.add(music);

        musicList.add(new MusicDatabase("Dj Snake, Bipolar Sunshine", "Middle", 5, R.drawable.middle_album_art));
        music = new MusicDatabase("Ed Sheeran", "Perfect", 5,R.drawable.ed_perfect_album_art);
        musicList.add(music);
        music = new MusicDatabase("Clean Bandit, Zara Larsson", "Symphony", 5,R.drawable.symphony_album_art);
        musicList.add(music);
        music = new MusicDatabase("Marshmello, Anne-Marie", "FRIENDS", 5,R.drawable.friends_album_art);
        musicList.add(music);
        musicList.add(new MusicDatabase("David Guetta", "One Last Time", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Ariana Grande", "One Last Time", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Justin Bieber", "What DO You Mean", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Chainsmokers", "Roses", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("One Direction", "Perfect", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Linkin Park", "In the end", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Akon", "Smack That", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Miley Cyrus", "Party in the USA", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Taylor Swift", "Love Story", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Enrique Iglesias", "Somebody's Me", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Neffrex", "Things are gonna get better", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Coldplay, Chainsmokers", "Something Just Like This", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("Selena Gomez, Kygo", "It Ain't Me", 5,R.drawable.default_music_albumart));
        musicList.add(new MusicDatabase("James Arthur", "Say You Won't Let Go", 5,R.drawable.default_music_albumart));

        mAdapter.notifyDataSetChanged();
    }
}

