package ua.com.senseye.schultetableapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList buttonList = new ArrayList<Button>();
    private ArrayList cellList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initialize();

        int size = buttonList.size();
        for (int i = 0; i < size; ++i) {
            Button button = (Button) buttonList.get(i);
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) findViewById(v.getId());

        button.setEnabled(false);
    }

    private void initialize() {
        String prefix = "button";

        for (int i = 1; i <= 25; ++i) {
            cellList.add(i);
            buttonList.add(findViewById(getResources().getIdentifier(prefix + Integer.toString(i), "id", getPackageName())));
        }

        Collections.shuffle(cellList);

        for (int i = 0; i <= 0; ++i) {
            Button button = (Button) buttonList.get(i);
            button.setText(Integer.toString((int)cellList.get(i)));
        }
    }
}
