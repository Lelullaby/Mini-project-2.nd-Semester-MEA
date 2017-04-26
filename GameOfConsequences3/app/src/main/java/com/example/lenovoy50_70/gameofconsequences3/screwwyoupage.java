package com.example.lenovoy50_70.gameofconsequences3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class screwwyoupage extends AppCompatActivity {
    public Button buttonsy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screwwyoupage);
        buttonsy = (Button) findViewById(R.id.buttonsy);


        //CHOOSING THE RANDOM CASE NUMBER
        Random rand1 = new Random();
        int chooser1 = rand1.nextInt(4);
        //ONE OF THESE CASES WILL BE CHOSEN AND PRINTED ON THE SCREEN, CREATING A NEW ACTIVITY FOR THE USERS
        switch (chooser1) {
            case 0:
                TextView view = (TextView) findViewById(R.id.sytextView);
                view.setText("Case number 0.0");
                break;
            case 1:
                TextView view1 = (TextView) findViewById(R.id.sytextView);
                view1.setText("Case number 1.0");
                break;
            case 2:
                TextView view2 = (TextView) findViewById(R.id.sytextView);
                view2.setText("Case number 2.0");
                break;
            case 3:
                TextView view3 = (TextView) findViewById(R.id.sytextView);
                view3.setText("Case number 3.0");
                break;
        }
    }




    public void pagechoosing() {
        Random rand = new Random();
        int pagechooser = rand.nextInt(4);


        switch (pagechooser) {
            case 0:
                Intent stch = new Intent(screwwyoupage.this, challengepage.class);
                startActivity(stch);
                break;
            case 1:
                Intent stga = new Intent(screwwyoupage.this, gamepage.class);
                startActivity(stga);
                break;
            case 2:
                Intent stsy = new Intent(screwwyoupage.this, screwwyoupage.class);
                startActivity(stsy);
                break;
            case 3:
                Intent stcy = new Intent(screwwyoupage.this, canyouspotpage.class);
                startActivity(stcy);
                break;
            case 4:
                Intent stdc = new Intent(screwwyoupage.this, doconsequencepage.class);
                startActivity(stdc);
                break;
        }
    }
    public void buttonclicktesting0(View view) {
        pagechoosing();
    }
}

