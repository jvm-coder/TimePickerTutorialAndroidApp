package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showTimePicker(View view) {
        DialogFragment frag = new timePickerFragment();
        frag.show(getSupportFragmentManager(), "TIME PICKER");
    }

    public void processTime(int hour, int minute) {
        String hourStr = Integer.toString(hour);
        String minuteStr = Integer.toString(minute);

        String timeMsg = hourStr + ":" + minuteStr;

        Toast.makeText(this, "Time " + timeMsg, Toast.LENGTH_SHORT).show();
    }
}