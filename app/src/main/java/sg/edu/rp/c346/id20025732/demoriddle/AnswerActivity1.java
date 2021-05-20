package sg.edu.rp.c346.id20025732.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAns = findViewById(R.id.textView);


        Intent i = getIntent();
        String QuestionSelected = i.getStringExtra("Question");
        int value = i.getIntExtra("Value", -1);
        tvAns.setText(QuestionSelected + "answer is: Queue" );


            }

}