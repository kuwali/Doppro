package com.awasisto.doppro;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class SimulatorActivity extends ActionBarActivity {
    private VehicleView sourceVehicle, observerVehicle;

    private int sourceFreq, sourseSpeed, observerSpeed, soundSpeed;
    private String sourceDirection, observerDirection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simulator);

        Bundle pass = getIntent().getExtras();
        sourceFreq = pass.getInt("sourceFreq");
        sourseSpeed = pass.getInt("soundSpeed");
        observerSpeed = pass.getInt("observerSpeed");
        soundSpeed = pass.getInt("soundSpeed");
        sourceDirection = pass.getString("sourceDirection");
        observerDirection = pass.getString("observerDirection");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simulator, menu);
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
