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
 * Main activity 2.
 */
public class MainActivity2 extends AppCompatActivity {
    /**
     * The ConstraintLayout Cl 2.
     */
    ConstraintLayout cl2;
    /**
     * Getting the Intent Gi.
     */
    Intent gi = getIntent();
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add("Black");
        menu.add("Yellow");
        menu.add("Purple");
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        cl2 = (ConstraintLayout) findViewById(R.id.cl2);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        String st = item.getTitle().toString();
        if(st.equals("Blue")){
            cl2.setBackgroundColor(Color.BLUE);
        }
        if(st.equals("Red")){
            cl2.setBackgroundColor(Color.RED);
        }
        if(st.equals("Green")){
            cl2.setBackgroundColor(Color.GREEN);
        }
        if(st.equals("Black")){
            cl2.setBackgroundColor(Color.BLACK);
        }
        if(st.equals("Yellow")){
            cl2.setBackgroundColor(Color.YELLOW);
        }
        if(st.equals("Purple")){
            cl2.setBackgroundColor(Color.MAGENTA);
        }
        return true;
    }

    /**
     * Return to the previous screen.
     *
     * @param view the view
     */
    public void Return(View view) {
        finish();
    }
}