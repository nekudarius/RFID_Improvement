package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_pairing_device.pairing_option;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.rubic.rfidimprovement.R;
import com.rubic.rfidimprovement.base.util.DialogHelper;
import com.rubic.rfidimprovement.base.util.listener.OnDialogOneButtonClick;

public class RfidPairingDeviceOptionFragment extends Fragment {
    public RfidPairingDeviceOptionFragment() {
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
        return inflater.inflate(R.layout.fragment_rfid_pairing_device_option, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TabLayout tabLayoutPairingOption = view.findViewById(R.id.tablayout_pairing_option);
        ViewPager2 viewPagerPairingOption = view.findViewById(R.id.viewpager_pairing_option);
        AppCompatImageButton btnHelpPairingOption = view.findViewById(R.id.btnHelpPairingOption);
        RfidPairingDeviceOptionAdapter rfidPairingDeviceOptionAdapter = new RfidPairingDeviceOptionAdapter(getActivity());
        viewPagerPairingOption.setAdapter(rfidPairingDeviceOptionAdapter);

        tabLayoutPairingOption.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerPairingOption.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPagerPairingOption.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback(){
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayoutPairingOption.getTabAt(position).select();
            }
        });

        btnHelpPairingOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogHelper.setConfirmationDialogOneButton(
                        getChildFragmentManager(),
                        "Pair Operation Guide",
                        "NFC: \nLorem Ipsum \n\nS/N: \nLorem Ipsum \n\nCamera: \nLorem Ipsum",
                        "Close",
                        new OnDialogOneButtonClick() {
                            @Override
                            public void onButtonClick(DialogFragment dialog, View view) {
                                Toast.makeText(getActivity(),"close",Toast.LENGTH_SHORT).show();
                            }
                        }
                );
            }
        });
    }

}