package com.siddworks.android.nanodegreeshowcaseapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.siddworks.android.nanodegreeshowcaseapp.R;
import com.siddworks.android.nanodegreeshowcaseapp.util.CommonUtil;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button spotifyStreamerAppButton = (Button) findViewById(R.id.button_spotify_streamer);
        spotifyStreamerAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonUtil.showToast(DashboardActivity.this, "This button will launch Spotify Streamer app!");
            }
        });

        Button scoresAppButton = (Button) findViewById(R.id.button_scores);
        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonUtil.showToast(DashboardActivity.this, "This button will launch Scores app!");
            }
        });

        Button libraryAppButton = (Button) findViewById(R.id.button_library);
        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonUtil.showToast(DashboardActivity.this, "This button will launch Library app!");
            }
        });

        Button buildItBiggerAppButton = (Button) findViewById(R.id.button_build_it_bigger);
        buildItBiggerAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonUtil.showToast(DashboardActivity.this, "This button will launch Build It Bigger app!");
            }
        });

        Button xyzReaderAppButton = (Button) findViewById(R.id.button_xyz_reader);
        xyzReaderAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonUtil.showToast(DashboardActivity.this, "This button will launch Xyz Reader app!");
            }
        });

        Button capstoneAppButton = (Button) findViewById(R.id.button_capstone_app);
        capstoneAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CommonUtil.showToast(DashboardActivity.this, "This button will launch My Capstone app!");
            }
        });
    }
}
