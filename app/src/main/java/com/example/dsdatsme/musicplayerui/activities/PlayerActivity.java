package com.example.dsdatsme.musicplayerui.activities;

import android.support.v7.app.ActionBar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;

import com.example.dsdatsme.musicplayerui.R;

public class PlayerActivity extends AppCompatActivity {
    private boolean buttonState = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        //hiding action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        //Intent intent = getIntent();
        //String sum = (String) intent.getSerializableExtra("SUM");



    }
    // for changing play/pause button
    public void changeButton(View view){
        if(buttonState)
            view.setBackgroundResource(R.drawable.ic_pause_button);
        else
            view.setBackgroundResource(R.drawable.ic_play_button);

        buttonState = !buttonState;
    }
}
