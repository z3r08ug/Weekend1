package dev.uublabs.weekend1;

import android.os.Bundle;
import android.support.design.widget.NavigationView;

public class ScheduleActivity extends BaseDrawerActivity implements NavigationView.OnNavigationItemSelectedListener
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
}
