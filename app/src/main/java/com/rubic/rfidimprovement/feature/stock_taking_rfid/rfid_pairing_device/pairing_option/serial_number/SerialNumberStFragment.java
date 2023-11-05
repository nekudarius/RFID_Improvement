package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_pairing_device.pairing_option.serial_number;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rubic.rfidimprovement.R;

public class SerialNumberStFragment extends Fragment {

    public SerialNumberStFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_serial_number_st, container, false);
    }
}