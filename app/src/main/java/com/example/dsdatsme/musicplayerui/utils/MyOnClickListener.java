package com.example.dsdatsme.musicplayerui.utils;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.dsdatsme.musicplayerui.R;
import com.example.dsdatsme.musicplayerui.activities.MainActivity;
import com.example.dsdatsme.musicplayerui.activities.PlayerActivity;


public class MyOnClickListener implements RecyclerView.OnClickListener {
    //RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    @Override
    public void onClick(final View view) {
        Toast.makeText(view.getContext(),"hello",Toast.LENGTH_LONG).show();
        Intent explicitIntent = new Intent(MainActivity.class,PlayerActivity.class);
        startActivity(explicitIntent);
    }

}
