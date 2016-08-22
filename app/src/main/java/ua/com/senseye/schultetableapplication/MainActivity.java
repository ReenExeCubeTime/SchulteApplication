package ua.com.senseye.schultetableapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList buttonList = new ArrayList<Button>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initializeButtonList();

        int size = buttonList.size();
        for (int i = 0; i < size; ++i) {
            Button button = (Button) buttonList.get(i);
            button.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        Button button = (Button) buttonList.get(1);

        button.setText("Center");
    }

    private void initializeButtonList() {
        String prefix = "button";

        for (int i = 0; i < 25; ++i) {
            buttonList.add(findViewById(getResources().getIdentifier(prefix + Integer.toString(i + 1), "id", getPackageName())));
        }
    }
}
