package io.github.opuserzangying.mybillbooks_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_addItem = (Button) findViewById(R.id.button_addItem);
        Button button_getItem = (Button) findViewById(R.id.button_getItem);
        Button button_exit = (Button) findViewById(R.id.button_exit);

    }
}
