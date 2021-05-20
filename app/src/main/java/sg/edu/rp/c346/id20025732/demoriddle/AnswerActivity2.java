package sg.edu.rp.c346.id20025732.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvans2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvans2 = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String QuestionSelected = intent.getStringExtra("Question");
        int value = intent.getIntExtra("Value", -1);
        tvans2.setText(QuestionSelected + "answer is: Gone");

    }
}