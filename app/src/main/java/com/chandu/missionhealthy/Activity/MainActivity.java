package com.chandu.missionhealthy.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.chandu.missionhealthy.R;
import com.chandu.missionhealthy.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ImageView imageView;
    TextView textView;
    CardView c1,c2,c3,c4,c5,c6;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        imageView = findViewById(R.id.health_products);
        textView = findViewById(R.id.textView3);
        c1=findViewById(R.id.h1);
        c2=findViewById(R.id.h2);
        c3=findViewById(R.id.h3);
        c4=findViewById(R.id.h4);
        c5=findViewById(R.id.h5);
        c6=findViewById(R.id.h6);



        c1.setOnClickListener(view -> {
            startActivity(new Intent(this,ProductActivity .class));
        });
        c2.setOnClickListener(view -> {
            startActivity(new Intent(this,HealthVideosActivity.class));
        });
        c3.setOnClickListener(view -> {
            startActivity(new Intent(this,DietChartActivity.class));
        });
        c4.setOnClickListener(view -> {
            startActivity(new Intent(this,ClientExActivity.class));
        });
        c5.setOnClickListener(view -> {
            startActivity(new Intent(this,ShareActivity.class));
        });
        c6.setOnClickListener(view -> {
            startActivity(new Intent(this,MoreAppsActivity.class));
        });






        setSupportActionBar(toolbar);




        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle
                (this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {

            new AlertDialog.Builder(MainActivity.this)
                    .setIcon(R.drawable.ic_baseline_warning_24)
                    .setTitle("Exit")
                    .setMessage("Are You Sure Want to exit the app")
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finishAffinity();

                        }
                    }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();

                }
            }).show();

        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {

        Intent intent;
        switch (item.getItemId()) {
            case R.id.activity_about2:
                break;
            case R.id.products:
                 intent = new Intent(MainActivity.this, ProductActivity.class);
                startActivity(intent);
                break;
            case R.id.contact:
                 intent= new Intent(MainActivity.this, ContactActivity.class);
                startActivity(intent);
                break;
            case R.id.playlist:
                intent= new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
                break;
            case R.id.privacyPolicy:
                intent= new Intent(MainActivity.this, PrivacyPolicyActivity.class);
                startActivity(intent);
                break;
            case R.id.aboutBtn:
                intent= new Intent(MainActivity.this, About.class);
                startActivity(intent);
                break;
            case R.id.free_service:
                intent= new Intent(MainActivity.this,FreeServicesActivity.class);
                startActivity(intent);
                break;
            case R.id.paid_service:
                intent= new Intent(MainActivity.this, PaidServicesActivity.class);
                startActivity(intent);
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


}