package com.example.socialapp.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.socialapp.MainActivity;
import com.example.socialapp.R;
import com.hyphenate.chat.EMClient;

import java.util.Date;

/**
 * //开屏页
 * Created by 陈梦轩 on 2017/3/22.
 */

public class PeacockActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_peacock);
         init();
    }private void init(){

new Thread(new Runnable() {
    Intent intent;
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   intent = new Intent(PeacockActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}).start();

    }


}
