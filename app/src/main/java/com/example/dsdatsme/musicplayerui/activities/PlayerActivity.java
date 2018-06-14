package com.example.dsdatsme.musicplayerui.activities;

import android.support.v7.app.ActionBar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dsdatsme.musicplayerui.R;
import com.example.dsdatsme.musicplayerui.utils.SquareImageGenerator;

public class PlayerActivity extends AppCompatActivity {
    private boolean buttonState = true;
    private TextView songName, artistName;
    private SquareImageGenerator playButton;
    private ImageView albumArt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //hiding action bar
        ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();

        actionBar.setDisplayHomeAsUpEnabled(true);
        setTitle("Now Playing");

        songName = (TextView) findViewById(R.id.song_name_text_view_player_activity);
        artistName = (TextView) findViewById(R.id.artist_name_text_view_player_activity);
        albumArt = (ImageView) findViewById(R.id.album_art_player_activity);
        playButton = (SquareImageGenerator) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {      // for changing play/pause button
            @Override
            public void onClick(View view) {
                if (buttonState)
                    view.setBackgroundResource(R.drawable.ic_pause_button);
                else
                    view.setBackgroundResource(R.drawable.ic_play_button);

                buttonState = !buttonState;
            }
        });

        Intent intent = getIntent();
        String temp = (String) intent.getStringExtra("SongName");
        songName.setText(temp);
        temp = (String) intent.getStringExtra("ArtistName");
        artistName.setText(temp);
        int temp2 =  intent.getIntExtra("AlbumArt",R.drawable.default_music_albumart);
        albumArt.setImageResource(temp2);
    }
}
