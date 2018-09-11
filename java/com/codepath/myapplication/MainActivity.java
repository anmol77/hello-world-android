package com.codepath.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView)
                        .setBackgroundColor(getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //grab the text user inputted
                // put the text into our text view once the 'change text' button is clicked
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)){
                    ((TextView)findViewById(R.id.textView)).setText("Hello from Anmol!");
                } else {
                    ((TextView)findViewById(R.id.textView)).setText(newText);
                }

            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            // reset the text color back to black
            public void onClick(View v) {
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));

                // reset the background color back to colorAccent
                findViewById(R.id.rootView)
                        .setBackgroundColor(getResources().getColor(R.color.colorAccent));

                // reset the text back to Hello from Anmol!
                ((TextView)findViewById(R.id.textView)).setText("Hello from Anmol!");
            }
        });




    }
}
