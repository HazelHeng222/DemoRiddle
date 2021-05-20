package sg.edu.ep.c346.id20029318.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtQ1;
    TextView txtQ2;
    Button butReveal1;
    Button butReveal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQ1 = findViewById(R.id.txtQ1);
        txtQ2 =findViewById(R.id.txtQ2);
        butReveal1 = findViewById(R.id.butReveal1);
        butReveal2 = findViewById(R.id.butReveal2);

        butReveal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewReveal) {
                Intent intent = new Intent( MainActivity.this, AnswerActivity1.class);
                intent.putExtra("Question1", "Qn 1");
                startActivity(intent);

            }
        });

        butReveal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewReveal2) {
                Intent i = new Intent( MainActivity.this, AnswerActivity2.class);
                i.putExtra("Question2", "Qn 2");
                startActivity(i);

            }
        });
    }
}