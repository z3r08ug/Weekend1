package dev.uublabs.weekend1;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;

public class ScheduleActivity extends BaseDrawerActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        getLayoutInflater().inflate(R.layout.activity_schedule, frameLayout);

        setTitle("Pats Schedule 2017");


    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }

    @Override
    public boolean onNavigateUp() {
        Log.d("HOME", "onNavigateUp: ");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.d("HOME", "onOptionsItemSelected: ");
        return false;
    }
}
