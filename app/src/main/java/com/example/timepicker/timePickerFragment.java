package com.example.timepicker;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link timePickerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class timePickerFragment extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment timePickerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static timePickerFragment newInstance(String param1, String param2) {
        timePickerFragment fragment = new timePickerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute  = c.get(Calendar.MINUTE);

        return new TimePickerDialog(getActivity(), this, hour, minute, false);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_time_picker, container, false);
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        MainActivity activity = (MainActivity) getActivity();
        activity.processTime(hourOfDay, minute);
    }

}