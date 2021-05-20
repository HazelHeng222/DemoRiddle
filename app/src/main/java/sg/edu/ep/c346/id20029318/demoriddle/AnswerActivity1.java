package sg.edu.ep.c346.id20029318.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView txtAns1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        Intent i = getIntent();
        String qnChosen = i.getStringExtra("Question1");

        txtAns1 = findViewById(R.id.txtAns1);
        //txtAns1.setText("In Second Activity");
        txtAns1.setText(qnChosen + " answer is: Queue");
    }
}