package sg.edu.rp.c346.id20025732.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView qn1;
    Button rv1;
    TextView qn2;
    Button rv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        qn1 = findViewById(R.id.qn1tv);
        rv1 = findViewById(R.id.btnRevealQ1);
        qn2 = findViewById(R.id.qn2tv);
        rv2 = findViewById(R.id.buttonRevealQ2);

        rv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,AnswerActivity1.class);
                i.putExtra("Question", "Q1");
                i.putExtra("Value",1);
                startActivity(i);
            }
        });

        rv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AnswerActivity2.class);
                intent.putExtra("Question", "Q2");
                intent.putExtra("Value","1");
                startActivity(intent);
            }
        });

            }
}