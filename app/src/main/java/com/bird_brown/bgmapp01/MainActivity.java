package com.bird_brown.bgmapp01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //STARTボタンのオブジェクトの取得とイベントリスナ登録
        Button start = (Button)findViewById(R.id.button1);
        start.setOnClickListener(this);

        //STOPボタンのオブジェクトの取得とイベントリスナ登録
        Button stop = (Button)findViewById(R.id.button2);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();  //押されたボタンのリソースIDを取得

        //インデントの生成
        Intent intent = new Intent(this, MusicService.class);

        switch (id) {
            case R.id.button1 : //STARTボタンを押した時の処理
                startService(intent);
                break;
            case R.id.button2 : //STOPボタンを押した時の処理
                stopService(intent);
                break;
        }

    }
}
