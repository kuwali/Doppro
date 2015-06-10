package com.awasisto.doppro;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by Kustiawanto on 6/9/2015.
 */
public abstract class Vehicle extends ImageView {
    private boolean left;

    public Vehicle(Context context, int resid) {
        super(context);
        setBackgroundResource(resid);
    }

    public void setDistance (boolean left) {
        if (left) {

        } else {

        }
    }


}
