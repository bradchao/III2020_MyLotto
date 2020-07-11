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

    public void createLotto1(View brad){
        String nums = newLotto(38, 6, true);
        mesg.setText(nums);
    }
    public void createLotto2(View brad){
        String nums = newLotto(49, 7, false);
        mesg.setText(nums);
    }
    public void createLotto3(View brad){
        String nums = newLotto(39, 5, false);
        mesg.setText(nums);
    }

    private String newLotto(int bigNum, int nums, boolean hasSpecical){
        
        return "WINNER";
    }

    public void createLotto(View view) {
        TreeSet<Integer> set = new TreeSet<>();
        String lotto = "";

        while (set.size()<6){
            int rand = (int)(Math.random()*38)+1;
            set.add(rand);
        }

        for (Integer num : set){
            lotto += num + "  ";
        }

        mesg.setText(lotto);
    }
}