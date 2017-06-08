package com.example.kz.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private FivePanell mPanel;
    private Button mRestart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPanel= (FivePanell) findViewById(R.id.id_panel);
        mRestart= (Button) findViewById(R.id.id_restart);
        mRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPanel.restart();
            }
        });

    }
}
