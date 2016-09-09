package com.example.enterprise.linearlayout_inside_oncreate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams lp;
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT);
        LinearLayout.LayoutParams textViewLP;
        textViewLP = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        LinearLayout ii = new  LinearLayout(this);
        ii.setOrientation(LinearLayout.VERTICAL);

        TextView myTextView = new TextView(this);
        myTextView.setText(getString(R.string.hello));  // strings.xml

        ii.addView(myTextView, textViewLP);
        this.addContentView(ii, lp);

    }
}
