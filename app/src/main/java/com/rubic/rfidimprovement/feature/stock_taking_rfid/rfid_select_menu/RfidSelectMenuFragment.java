package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_select_menu;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.rubic.rfidimprovement.R;

public class RfidSelectMenuFragment extends Fragment {

    NavController navController;

    public RfidSelectMenuFragment() {
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
        View view = inflater.inflate(R.layout.fragment_rfid_select_menu, container, false);

        NavHostFragment navHostFragment = (NavHostFragment) getChildFragmentManager()
                .findFragmentById(R.id.nav_host_fragment_rfid_select_menu);
        navController = navHostFragment.getNavController();

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        navController = Navigation.findNavController(view);

        BottomNavigationView bnvRfidTabMenu = view.findViewById(R.id.bnv_rfid_tab_menu);

//        NavigationUI.setupWithNavController(bnvRfidTabMenu, navController);

//        bnvRfidTabMenu.setBackground(null);
        bnvRfidTabMenu.setOnItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.rfid_scanning){
                Toast.makeText(getActivity(),"scan",Toast.LENGTH_SHORT).show();
                navController.navigate(R.id.rfidStockTakingListFragment);
            } else if (id == R.id.rfid_pairing_device){
                Toast.makeText(getActivity(),"pairing",Toast.LENGTH_SHORT).show();
                navController.navigate(R.id.rfidPairingDeviceHomescreenFragment);
            }
            return true;
        });
    }
}