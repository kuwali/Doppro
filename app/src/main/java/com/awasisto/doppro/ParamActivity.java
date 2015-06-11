package com.awasisto.doppro;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ParamActivity extends ActionBarActivity {
    Context thisObject;
    EditText sourceFreqEditText, sourceSpeedEditText, observerSpeedEditText, soundSpeedEditText;
    TextView sourceDirectionTextView, observerDirectionTextView;
    Button launchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_param);

        thisObject = this;
        sourceFreqEditText = (EditText) findViewById(R.id.sourceFreqEditText);
        sourceSpeedEditText = (EditText) findViewById(R.id.sourceSpeedEditText);
        observerSpeedEditText = (EditText) findViewById(R.id.observerSpeedEditText);    
        soundSpeedEditText = (EditText) findViewById(R.id.speedOfSoundEditText);
        sourceDirectionTextView = (TextView) findViewById(R.id.sourceDirectionTextView);
        observerDirectionTextView = (TextView) findViewById(R.id.observerDirectionTextView);
        launchButton = (Button) findViewById(R.id.launchBtn);

        sourceDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) v;
                if ("RIGHT".equals(tv.getText().toString())) {
                    tv.setText("LEFT");
                    tv.setTextColor(Color.parseColor("#b71c1c"));
                } else {
                    tv.setText("RIGHT");
                    tv.setTextColor(Color.parseColor("#0d47a1"));
                }
            }
        });

        observerDirectionTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = (TextView) v;
                if ("RIGHT".equals(tv.getText().toString())) {
                    tv.setText("LEFT");
                    tv.setTextColor(Color.parseColor("#b71c1c"));
                } else {
                    tv.setText("RIGHT");
                    tv.setTextColor(Color.parseColor("#0d47a1"));
                }
            }
        });

        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle simParam = new Bundle();
                simParam.putInt("sourceFreq", Integer.parseInt(sourceFreqEditText.getText()
                        .toString()));
                simParam.putInt("sourceSpeed", Integer.parseInt(sourceSpeedEditText.getText()
                        .toString()));
                simParam.putInt("observerSpeed", Integer.parseInt(observerSpeedEditText.getText()
                        .toString()));
                simParam.putInt("soundSpeed", Integer.parseInt(soundSpeedEditText.getText()
                        .toString()));
                simParam.putString("sourceDirection", sourceDirectionTextView.getText().toString());
                simParam.putString("observerDirection", observerDirectionTextView.getText()
                        .toString());
                Intent simIntent = new Intent(thisObject, SimulatorActivity.class);
                simIntent.putExtras(simParam);
                startActivity(simIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_param, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
