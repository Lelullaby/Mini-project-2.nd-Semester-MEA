package com.example.lenovoy50_70.gameofconsequences3;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class canyouspotpage extends AppCompatActivity {

    public Button buttoncy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canyouspotpage);
        buttoncy = (Button) findViewById(R.id.buttoncy);


        //CHOOSING THE RANDOM CASE NUMBER
        Random rand1 = new Random();
        int chooser1 = rand1.nextInt(4);
        //ONE OF THESE CASES WILL BE CHOSEN AND PRINTED ON THE SCREEN, CREATING A NEW ACTIVITY FOR THE USERS
        switch (chooser1) {
            case 0:
                TextView view = (TextView) findViewById(R.id.cytextView);
                view.setText("Case number 0.1");
                ImageView imageViewcy = (ImageView) findViewById(R.id.imageViewcy);
                imageViewcy.setImageResource(R.drawable.gameofconcanyouspotslutty2);
                break;
            case 1:
                TextView view1 = (TextView) findViewById(R.id.cytextView);
                view1.setText("Case number 1.1");
                ImageView imageViewcy1 = (ImageView) findViewById(R.id.imageViewcy);
                imageViewcy1.setImageResource(R.drawable.gameofconcanyouspotdressedthesame);
                break;
            case 2:
                TextView view2 = (TextView) findViewById(R.id.cytextView);
                view2.setText("Case number 2.1");
                ImageView imageViewcy2 = (ImageView) findViewById(R.id.imageViewcy);
                imageViewcy2.setImageResource(R.drawable.gameofconcanyouspotharleyquinn);
                break;
            case 3:
                TextView view3 = (TextView) findViewById(R.id.cytextView);
                view3.setText("Case number 3.1");
                ImageView imageViewcy3 = (ImageView) findViewById(R.id.imageViewcy);
                imageViewcy3.setImageResource(R.drawable.gameofconcanyouspotmanincostume3);
                break;
            case 4:
                TextView view4 = (TextView) findViewById(R.id.cytextView);
                view4.setText("Case number 4.1");
                ImageView imageViewcy4 = (ImageView) findViewById(R.id.imageViewcy);
                imageViewcy4.setImageResource(R.drawable.gameofconcanyouspotjoker);
                break;
        }
    }




    public void pagechoosing() {
        Random rand = new Random();
        int pagechooser = rand.nextInt(4);


        switch (pagechooser) {
            case 0:
                Intent stch = new Intent(canyouspotpage.this, challengepage.class);
                startActivity(stch);
                break;
            case 1:
                Intent stga = new Intent(canyouspotpage.this, gamepage.class);
                startActivity(stga);
                break;
            case 2:
                Intent stsy = new Intent(canyouspotpage.this, screwwyoupage.class);
                startActivity(stsy);
                break;
            case 3:
                Intent stcy = new Intent(canyouspotpage.this, canyouspotpage.class);
                startActivity(stcy);
                break;
            case 4:
                Intent stdc = new Intent(canyouspotpage.this, doconsequencepage.class);
                startActivity(stdc);
                break;
        }
    }
    public void buttonclicktesting4(View view) {
        pagechoosing();
    }
}

