package dev.uublabs.weekend1;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.FrameLayout;

public class BaseDrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    DrawerLayout drawerLayout;
    FrameLayout frameLayout;
    NavigationView navView;
    android.support.v7.widget.Toolbar toolbar;
    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawerLayout = findViewById(R.id.drawer_layout);
        drawerLayout.addDrawerListener(toggle);

        frameLayout = findViewById(R.id.content_frame);

        navView = findViewById(R.id.navigation);

        navView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.actionbar, menu);
        return true;
    }

    @Override
    public void onBackPressed()
    {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        Log.d("Base", "onNavigationItemSelected: got here");
        int id = item.getItemId();

        if(item.isChecked())
        {
            drawerLayout.closeDrawer(GravityCompat.START);
            return false;
        }

        if(id == R.id.home3)
        {
            startActivity(new Intent(getApplicationContext(), HomeScreenActivity.class));
        }
        if(id == R.id.roster)
        {
            startActivity(new Intent(getApplicationContext(), RosterActivity.class));
        }
        if(id == R.id.schedule)
        {
            startActivity(new Intent(getApplicationContext(), ScheduleActivity.class));
        }
        if(id == R.id.standings)
        {
            startActivity(new Intent(getApplicationContext(), Standings.class));
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.homeAsUp:
            {
                return true;
            }
            case R.id.home1:
            {
                return true;
            }
            case R.id.Settings:
            {
                return true;
            }
            case R.id.tix1:
            {
                return true;
            }
            default:
            {
                return super.onOptionsItemSelected(item);
            }
        }
    }
}
