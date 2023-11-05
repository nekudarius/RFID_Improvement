package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_pairing_device.homescreen;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.rubic.rfidimprovement.R;

public class RfidPairingDeviceHomescreenFragment extends Fragment {

    public RfidPairingDeviceHomescreenFragment() {
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
        return inflater.inflate(R.layout.fragment_rfid_pairing_device_homescreen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FloatingActionButton fabAddRfidDevice = view.findViewById(R.id.fab_add_rfid_device);

        fabAddRfidDevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_rfidPairingDeviceHomescreenFragment_to_rfidPairingDeviceOptionFragment);
            }
        });

    }
}