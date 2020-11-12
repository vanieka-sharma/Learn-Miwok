package com.example.learnmivac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find the View that show the number category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        TextView phrases = (TextView)findViewById(R.id.phrases);
        TextView family = (TextView)findViewById(R.id.family);
        TextView colors = (TextView)findViewById(R.id.colors);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Start the new activity
                Intent numberIntent = new Intent(MainActivity.this,NumberActivity.class);
                startActivity(numberIntent);
                Toast.makeText(view.getContext(), "Open the list of numbers", Toast.LENGTH_SHORT).show();

            }
        });
        colors.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Start the new activity
                Intent colorIntent = new Intent(MainActivity.this,ColorsAcitivity.class);
                startActivity(colorIntent);
                Toast.makeText(view.getContext(), "Open the list of colors", Toast.LENGTH_SHORT).show();

            }
        });
        family.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Start the new activity
                Intent familyIntent = new Intent(MainActivity.this,FamilyMember.class);
                startActivity(familyIntent);
                Toast.makeText(view.getContext(), "Open the list of family members", Toast.LENGTH_SHORT).show();

            }
        });
        phrases.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Start the new activity
                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrasesIntent);
                Toast.makeText(view.getContext(), "Open the list of phrases", Toast.LENGTH_SHORT).show();

            }
        });
    }

}