package id.sch.smktelkom_mlg.project.xiirpl106162636.fun;

/**
 * Created by Fadwa on 10/18/2016.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ResultActivity extends Activity {

    String answers[] = {"", "", "", "", "", "", "", "", "", "", "", ""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView textResult = (TextView) findViewById(R.id.textResult);
        TextView answer = (TextView) findViewById(R.id.textViewAnswer);

        Bundle b = getIntent().getExtras();

        int score = b.getInt("score");
        answers = b.getStringArray("answers");

        textResult.setText("Skor akhir anda di chapter ini adalah");
        answer.setText("" + score + "");
    }

    /*public void playagain(View o) {

        Intent intent = new Intent(this, SlidingQuiz.class);

        startActivity(intent);


    }*/

    public void home(View view) {
        onBackPressed();
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
    }

    /*findViewById(R.id.buttonHome).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, PlayActivity.class);
            startActivity(intent);
        }
    });*/
}

