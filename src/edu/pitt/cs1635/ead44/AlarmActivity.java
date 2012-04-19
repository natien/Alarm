package edu.pitt.cs1635.ead44;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AlarmActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        Spinner meterTime = (Spinner)findViewById(R.id.timerSpin);
        ArrayAdapter<CharSequence> meterTimeAdapter = ArrayAdapter.createFromResource(
        		this, R.array.meterTimeArray, android.R.layout.simple_spinner_item);
        meterTimeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        meterTime.setAdapter(meterTimeAdapter);
        
        Spinner alarmTime = (Spinner)findViewById(R.id.alarmSpin);
        ArrayAdapter<CharSequence> alarmTimeAdapter = ArrayAdapter.createFromResource(
        		this, R.array.alarmArray, android.R.layout.simple_spinner_item);
        alarmTimeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alarmTime.setAdapter(alarmTimeAdapter);
        
        Spinner alertTime = (Spinner)findViewById(R.id.alertSpin);
        ArrayAdapter<CharSequence> alertTimeAdapter = ArrayAdapter.createFromResource(
        		this, R.array.alertArray, android.R.layout.simple_spinner_item);
        alertTimeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        alertTime.setAdapter(alertTimeAdapter);
    
    }
    
    
}