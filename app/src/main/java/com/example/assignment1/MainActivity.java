package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView diceComp = findViewById(R.id.imgDice1);
        ImageView diceUser = findViewById(R.id.imgDice2);
        Button button1 =findViewById(R.id.btnHigher);
        Button button2 =findViewById(R.id.btnLower);
        TextView WinDisp= findViewById(R.id.txtWinner);

        int[] arrayDice = { R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomObj= new Random();

                int compRandom = randomObj.nextInt(6);
                int userRandom = randomObj.nextInt(6);

                diceComp.setImageResource(arrayDice[compRandom]);
                diceUser.setImageResource(arrayDice[userRandom]);

                if(compRandom>userRandom){
                    WinDisp.setText("Computer wins");
                }
                else if(compRandom<userRandom){
                    WinDisp.setText("User wins");
                }
                else {
                    WinDisp.setText("It's a tie");
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random randomObj= new Random();

                int compRandom = randomObj.nextInt(6);
                int userRandom = randomObj.nextInt(6);

                diceComp.setImageResource(arrayDice[compRandom]);
                diceUser.setImageResource(arrayDice[userRandom]);


                if(compRandom<userRandom){
                    WinDisp.setText("Computer wins");
                }
                else if(compRandom>userRandom){
                    WinDisp.setText("User wins");
                }
                else {
                    WinDisp.setText("It's a tie");
                }


            }
        });


    }
}