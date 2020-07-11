package tw.brad.apps.mylotto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;
import java.util.TreeSet;

public class MainActivity extends AppCompatActivity {
    private TextView mesg; // [a-zA-Z$_][a-zA-Z0-9$_]*

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mesg = findViewById(R.id.mesg);

    }

    public void createLotto(View view) {
        TreeSet<Integer> set = new TreeSet<>();
        String lotto = "";

        while (set.size()<6){
            int rand = (int)(Math.random()*38)+1;
            set.add(rand);
        }

        mesg.setText(set.toString());
    }
}