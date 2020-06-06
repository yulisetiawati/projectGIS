package com.example.gisvihara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivmap= findViewById(R.id.iv_map);
        ivmap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent pindah = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(pindah);
    }
}
