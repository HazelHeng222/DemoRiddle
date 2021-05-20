package sg.edu.ep.c346.id20029318.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView txtAns2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        Intent i = getIntent();
        String qnChosen = i.getStringExtra("Question2");

        txtAns2 = findViewById(R.id.txtAns2);
        txtAns2.setText(qnChosen + " answer is: Gone");
    }
}