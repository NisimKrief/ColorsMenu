package com.example.colorsmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Main activity.

 *  @author	Nisim Doron Krief <nisimandroi@gmail.com>
 *  @version	1.1
 *  @since	29/12/2022 (the date of the package the class was added)
 *  Program that uses menu to change the colors of the screen

 */
public class MainActivity extends AppCompatActivity {
    /**
     * The ConstraintLayout Cl.
     */
    ConstraintLayout cl;
    /**
     * The Intent Si.
     */
    Intent si;

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cl = findViewById(R.id.cl);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        String st = item.getTitle().toString();
        if(st.equals("Blue")){
            cl.setBackgroundColor(Color.BLUE);
        }
        if(st.equals("Red")){
            cl.setBackgroundColor(Color.RED);
        }
        if(st.equals("Green")){
            cl.setBackgroundColor(Color.GREEN);
        }
        return true;
    }

    /**
     * Pressing the button and applying the intent.
     *
     * @param view the view
     */
    public void Go(View view) {
        si = new Intent(this, MainActivity2.class);
        startActivity(si);
    }
}