package dev.uublabs.weekend1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Standings extends BaseDrawerActivity
{

    private ToggleButton afcBtn;
    private ToggleButton nfcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        getLayoutInflater().inflate(R.layout.activity_standings, frameLayout);

        setTitle("NFL Standings 2017-18");

        afcBtn = findViewById(R.id.afcToggle);
        nfcBtn = findViewById(R.id.nfcToggle);

        final ImageView standings = findViewById(R.id.stands);

        CompoundButton.OnCheckedChangeListener changeListener = new CompoundButton.OnCheckedChangeListener()
        {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if(isChecked)
                {
                    if (buttonView == afcBtn)
                    {
                        nfcBtn.setChecked(false);
                        standings.setImageResource(R.drawable.afc);
                    }
                    else if(buttonView == nfcBtn)
                    {
                        afcBtn.setChecked(false);
                        standings.setImageResource(R.drawable.nfc);
                    }
                }
            }
        };

        afcBtn.setOnCheckedChangeListener(changeListener);
        nfcBtn.setOnCheckedChangeListener(changeListener);
    }
}
