package com.example.demo_navigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
DrawerLayout drawerLayout01;
Toolbar toobar01;
NavigationView nav01;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout01=findViewById(R.id.drawerLayout01);
        toobar01=findViewById(R.id.toobar01);
        nav01=findViewById(R.id.nav01);
        setSupportActionBar(toobar01);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle actionBarDrawerToggle= new ActionBarDrawerToggle(
                this,drawerLayout01,toobar01,R.string.open,R.string.close
        );
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();
        drawerLayout01.addDrawerListener(actionBarDrawerToggle);

        nav01.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fm;
                if(item.getItemId() == R.id.home){
                    fm=new Frag111();
                    toobar01.setTitle("Home");

                } else if (item.getItemId()==R.id.nd) {
                    fm=new Frag111();

                    toobar01.setTitle("người dung");
                }else{
            fm=new Frag111();
            toobar01.setTitle("Admin");
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frag_container001,fm).commit();
        drawerLayout01.close();
                return true;
            }
        });
    }
}