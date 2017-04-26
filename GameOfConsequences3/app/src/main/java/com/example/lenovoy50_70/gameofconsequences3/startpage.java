package com.example.lenovoy50_70.gameofconsequences3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class startpage extends AppCompatActivity {

    Button startmenubutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startpage);
        startmenubutton = (Button) findViewById(R.id.buttonch);
    }

    //THIS CREATES THE FIRST RANDOM TO THE SWITCH
    public void pagechoosing() {
        Random rand = new Random();
        int pagechooser = rand.nextInt(4);

// THIS CHOOSES WHICH PAGE TO GO TO
        switch (pagechooser) {
            case 0:
                Intent stch = new Intent(startpage.this, challengepage.class);
                startActivity(stch);
                break;
            case 1:
                Intent stga = new Intent(startpage.this, gamepage.class);
                startActivity(stga);
                break;
            case 2:
                Intent stsy = new Intent(startpage.this, screwwyoupage.class);
                startActivity(stsy);
                break;
            case 3:
                Intent stcy = new Intent(startpage.this, canyouspotpage.class);
                startActivity(stcy);
                break;
            case 4:
                Intent stdc = new Intent(startpage.this, doconsequencepage.class);
                startActivity(stdc);
                break;
        }
    }

    public void buttonclicktesting(View view) {
        pagechoosing();
    }

}
