package com.example.coursesexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdvancedWebDesign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_advanced_web_design);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id==R.id.action_Home){

            Intent intenthome = new Intent(this, MainActivity.class);
            startActivity(intenthome);
            finish();
            return true;
        }

        if (id==R.id.action_DBMS){

            Intent intentdbms = new Intent(this, MainActivity.class);
            startActivity(intentdbms);
            finish();
            return true;
        }

        if (id==R.id.action_AWD){

            Intent intentawd = new Intent(this, MainActivity.class);
            startActivity(intentawd);
            finish();
            return true;
        }

        if (id==R.id.action_MAD){

            Intent intentmad = new Intent(this, MobileApplicationsDevelopment.class);
            startActivity(intentmad);
            finish();
            return true;
        }

        if (id==R.id.action_exit){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}