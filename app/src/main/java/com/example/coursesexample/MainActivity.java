package com.example.coursesexample;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        MaterialCardView cardAWD = findViewById(R.id.cardAWD);
        MaterialCardView cardDBMS = findViewById(R.id.cardDBMS);
        MaterialCardView cardMAD = findViewById(R.id.cardMAD);


        cardAWD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AdvancedWebDesign.class);
                startActivity(intent);
            }
        });


        cardDBMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DatabaseManagementSystems.class);
                startActivity(intent);
            }
        });

        cardMAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MobileApplicationsDevelopment.class);
                startActivity(intent);
            }
        });

        Button popupMenuButton = findViewById(R.id.buttonPopUp);

        popupMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);

                popupMenu.getMenuInflater().inflate(R.menu.buttonpopup, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        if(menuItem.getItemId()==R.id.menu1){
                            Toast.makeText(MainActivity.this, "Menu 1 is clicked", Toast.LENGTH_SHORT).show();
                            return true;
                        }

                        else if(menuItem.getItemId()==R.id.menu2){
                            Toast.makeText(MainActivity.this, "Menu 2 is clicked", Toast.LENGTH_SHORT).show();
                            return true;
                        }

                        else if (menuItem.getItemId()==R.id.menu3){
                            Toast.makeText(MainActivity.this, "Menu 3 is clicked", Toast.LENGTH_SHORT).show();
                            return true;
                        } else{
                            return false;
                        }
                    }
                });

                popupMenu.show();
            }
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

            Intent intentdbms = new Intent(this, DatabaseManagementSystems.class);
            startActivity(intentdbms);
            finish();
            return true;
        }

        if (id==R.id.action_AWD){

            Intent intentawd = new Intent(this, AdvancedWebDesign.class);
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