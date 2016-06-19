package com.example.a437.gun_paradise.codeView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.widget.LinearLayout;

import static android.view.ViewGroup.*;

public class Main2Activity extends Activity {
    private Button start;
    private Button settings;
    private Button about;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // creating LinearLayout
        LinearLayout linLayout = new LinearLayout(this);
        // specifying vertical orientation
        linLayout.setOrientation(LinearLayout.VERTICAL);
        // creating LayoutParams
        LayoutParams linLayoutParam = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        // set LinearLayout as a root element of the screen
        setContentView(linLayout, linLayoutParam);
        //Percentage based menu, linear

    }
}
