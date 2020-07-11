package tw.brad.apps.mylotto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
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
        mesg.setTextColor(Color.BLUE);
    }
    public void createLotto2(View brad){
        String nums = newLotto(49, 6, false);
        mesg.setText(nums);
        mesg.setTextColor(Color.RED);
    }
    public void createLotto3(View brad){
        String nums = newLotto(39, 5, false);
        mesg.setText(nums);
        mesg.setTextColor(Color.BLACK);
    }

    private String newLotto(int bigNum, int nums, boolean hasSpecial){
        TreeSet<Integer> set = new TreeSet<>();
        String lotto = "";
        while (set.size()<nums){
            int rand = (int)(Math.random()*bigNum)+1;
            set.add(rand);
        }

        for (Integer num : set){
            lotto += num + "  ";
        }

        if (hasSpecial){
            int special = (int)(Math.random()*8)+1;
            lotto += "\n" + special;
        }

        return lotto;
    }

}