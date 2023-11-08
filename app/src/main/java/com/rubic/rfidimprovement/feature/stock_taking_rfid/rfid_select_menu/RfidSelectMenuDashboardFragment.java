package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_select_menu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.rubic.rfidimprovement.R;

public class RfidSelectMenuDashboardFragment extends Fragment {

    public RfidSelectMenuDashboardFragment() {
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
        return inflater.inflate(R.layout.fragment_rfid_select_menu_dashboard, container, false);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CardView cvSelectMenuPairing = view.findViewById(R.id.cv_select_menu_pairing);
        CardView cvSelectMenuScanning = view.findViewById(R.id.cv_select_menu_scanning);
        CardView cvSelectMenuSettings = view.findViewById(R.id.cv_select_menu_settings);
        ImageButton ivBack = view.findViewById(R.id.iv_back);

        cvSelectMenuPairing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_rfidSelectMenuDashboardFragment_to_rfidPairingDeviceHomescreenFragment);
            }
        });

        cvSelectMenuScanning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_rfidSelectMenuDashboardFragment_to_rfidStockTakingListFragment);
            }
        });

        ivBack.setOnClickListener(v -> onBackPressed());


    }

    public void onBackPressed() {
        if (!Navigation.findNavController(requireView()).popBackStack()) {
            requireActivity().finish();
        }
    }
}