package com.lolstudio.shortcut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btn=new Button(this);
        btn.setText("涛涛");
        setContentView(btn);
    }
}
