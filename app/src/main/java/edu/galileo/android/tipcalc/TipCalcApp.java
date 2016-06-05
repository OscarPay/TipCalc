package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by USER on 01/06/2016.
 */
public class TipCalcApp extends Application {
    private final static String ABOUT_URL = "https://www.google.com.mx/";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
