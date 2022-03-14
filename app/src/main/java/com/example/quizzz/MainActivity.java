package com.example.quizzz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String [] questions = {"Is Naruto a girl?","Does Naruto know Rasengan?",
            "Does Naruto have kids?","Does Naruto marry Sakura?","Is Naruto's master Jiraya?"};
    private final boolean[] answers = {false,true,true,false,true};
    private int index = 0;
    private int score = 0;

    TextView question;
    Button yes;
    Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.button);
        no = findViewById(R.id.button2);
        question = findViewById(R.id.question);
        question.setText(questions[index]);
        yes.setOnClickListener(view -> {
            if(index <= questions.length-1) {


                if (answers[index]) {
                    score++;

                }
                index++;
                if(index <= questions.length-1){
                    question.setText(questions[index]);
                }
                else {
                    Toast.makeText(MainActivity.this, "Your Score is "+score + "/" +questions.length, Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
            }

        });
          no.setOnClickListener(view -> {

              if(index <= questions.length-1) {


                  if (!answers[index]) {
                      score++;

                  }
                  index++;
                  if(index <= questions.length-1){
                      question.setText(questions[index]);
                  }
                  else {
                      Toast.makeText(MainActivity.this, "Your Score is "+score + "/" +questions.length, Toast.LENGTH_SHORT).show();

                  }
              }else{
                  Toast.makeText(MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
              }
          });

    }
}
