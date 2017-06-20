package com.elyeproj.horizontallayoutanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView billionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        billionText = (TextView) findViewById(R.id.txt_billion);
    }

    public void clickMe(View view) {
        if (billionText.getVisibility() == View.GONE) {
            billionText.setVisibility(View.VISIBLE);
        } else {
            billionText.setVisibility(View.GONE);
        }
    }
}
