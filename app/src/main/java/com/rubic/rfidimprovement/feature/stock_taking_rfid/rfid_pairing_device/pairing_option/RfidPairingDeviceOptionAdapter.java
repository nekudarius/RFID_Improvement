package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_pairing_device.pairing_option;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_pairing_device.pairing_option.camera.CameraStFragment;
import com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_pairing_device.pairing_option.nfc.NfcStFragment;
import com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_pairing_device.pairing_option.serial_number.SerialNumberStFragment;

public class RfidPairingDeviceOptionAdapter extends FragmentStateAdapter {
    public RfidPairingDeviceOptionAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new NfcStFragment();
            case 1:
                return new SerialNumberStFragment();
            case 2:
                return new CameraStFragment();
            default:
                return new NfcStFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
