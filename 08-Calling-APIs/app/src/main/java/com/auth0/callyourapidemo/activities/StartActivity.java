package com.auth0.callyourapidemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.auth0.callyourapidemo.R;


public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Intent lockIntent = new Intent(this, LockActivity.class);
        startActivity(lockIntent);

    }


}
