package com.example.colorsmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout cl;
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

    public void Go(View view) {
        si = new Intent(this, MainActivity2.class);
        startActivity(si);
    }
}