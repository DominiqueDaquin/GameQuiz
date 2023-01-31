package com.example.gamequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import java.net.URL;

public class ligneActivity extends AppCompatActivity {
    VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligne);
        videoview = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bg1);
        videoview.setVideoURI(uri);
        videoview.start();

        videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });
    }

    @Override
    protected void onPostResume() {
        videoview.resume();
        super.onPostResume();
    }

    @Override
    protected void onRestart() {
        videoview.start();
        super.onRestart();
    }

    @Override
    protected void onPause() {
        videoview.suspend();
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        videoview.stopPlayback();
        super.onDestroy();
    }
}