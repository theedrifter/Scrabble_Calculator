package com.example.administrator.scrabblecalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 *
 */
public class startScreen extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);

        Button newGameButton = (Button) findViewById(R.id.newGameButton);
        newGameButton.setOnClickListener(newGameButtonListener);
    }

    public View.OnClickListener newGameButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(startScreen.this, PlayerNum.class));
        }
    };
}
