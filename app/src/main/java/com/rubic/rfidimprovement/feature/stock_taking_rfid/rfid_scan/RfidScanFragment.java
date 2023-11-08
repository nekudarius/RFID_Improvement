package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_scan;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.rubic.rfidimprovement.R;
import com.rubic.rfidimprovement.base.util.DialogHelper;
import com.rubic.rfidimprovement.base.util.listener.OnDialogButtonClick;
import com.rubic.rfidimprovement.base.util.listener.OnDialogOneButtonClick;

import java.util.ArrayList;
import java.util.List;

public class RfidScanFragment extends Fragment {


    private ArrayList<RfidScanData> rackList;
    private RfidScanAdapter rfidScanAdapter;
    RecyclerView rvParent;

    private ArrayList<RfidScanPrinterData> printerList;
    private RfidScanPrinterAdapter rfidScanPrinterAdapter;
    RecyclerView rvChild;
    public RfidScanFragment() {
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
//        return inflater.inflate(R.layout.fragment_rfid_scan, container, false);
        View rootView = inflater.inflate(R.layout.fragment_rfid_scan, container, false);

        rackList = generateRackList();

        printerList = generatePrinterList();

        rvParent = rootView.findViewById(R.id.rv_parent);
        rvParent.setLayoutManager(new LinearLayoutManager(getActivity()));

        rfidScanAdapter = new RfidScanAdapter(getActivity(), rackList, printerList);
//        rfidScanAdapter = new RfidScanAdapter(rackList);
        rvParent.setAdapter(rfidScanAdapter);






        return rootView;


    }

    private ArrayList<RfidScanData> generateRackList(){
        ArrayList<RfidScanData> rackList = new ArrayList<>();
        rackList.add(new RfidScanData("1A"));
        rackList.add(new RfidScanData("1B"));
        rackList.add(new RfidScanData("1C"));
        rackList.add(new RfidScanData("2A"));
        rackList.add(new RfidScanData("2B"));
        rackList.add(new RfidScanData("2C"));
        rackList.add(new RfidScanData("3A"));

        rackList.add(new RfidScanData("1A"));
        rackList.add(new RfidScanData("1B"));
        rackList.add(new RfidScanData("1C"));
        rackList.add(new RfidScanData("2A"));
        rackList.add(new RfidScanData("2B"));
        rackList.add(new RfidScanData("2C"));
        rackList.add(new RfidScanData("3A"));

        rackList.add(new RfidScanData("1A"));
        rackList.add(new RfidScanData("1B"));
        rackList.add(new RfidScanData("1C"));
        rackList.add(new RfidScanData("2A"));
        rackList.add(new RfidScanData("2B"));
        rackList.add(new RfidScanData("2C"));
        rackList.add(new RfidScanData("3A"));

        return rackList;
    }

    private ArrayList<RfidScanPrinterData> generatePrinterList(){
        ArrayList<RfidScanPrinterData> printerList = new ArrayList<>();
        printerList.add(new RfidScanPrinterData("Lucida-FJX", "XBZ0082", "Full Assy", "IEI001",
                "IEI001-0", "IEI001-1", "IEI001-2", "IEI001-3", "IEI001-4"));
        printerList.add(new RfidScanPrinterData("Naiad8-MD", "ABC0056", "Full Assy", "IEI002",
                "IEI002-0", "IEI002-1", "IEI002-2", "IEI002-3", "IEI002-4"));
        printerList.add(new RfidScanPrinterData("Nicole12-MC", "DEF0056", "Full Assy", "IEI003",
                "IEI003-0", "IEI002-3", "IEI003-2", "IEI002-3", "IEI003-4"));
        printerList.add(new RfidScanPrinterData("Naiad5-MD", "GHI0022", "Full Assy", "IEI004",
                "IEI004-0", "IEI004-1", "IEI004-2", "IEI004-3", "IEI004-4"));


        return printerList;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AppCompatImageButton btnWarning = view.findViewById(R.id.btnWarning);
        AppCompatImageButton btnHelp = view.findViewById(R.id.btnHelp);
        FloatingActionButton fabSubmit = view.findViewById(R.id.fab_submit);
        ImageButton ivBack = view.findViewById(R.id.iv_back);

        ivBack.setOnClickListener(v -> onBackPressed());


        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = view;
                DialogHelper.setConfirmationDialog(
                        getChildFragmentManager(),
                        "Error Disconnected!",
                        "It seems like your RFID Device is disconnected. Please re-connect to continue perform stock taking",
                        getString(R.string.label_yes),
                        getString(R.string.label_no),
                        new OnDialogButtonClick() {
                            @Override
                            public void onRightButtonClick(DialogFragment dialog, View view) {
                                Toast.makeText(getActivity(),"yes",Toast.LENGTH_SHORT).show();
                                Navigation.findNavController(view1).navigate(R.id.action_rfidScanFragment_to_rfidPairingDeviceHomescreenFragment);
                            }

                            @Override
                            public void onLeftButtonClick(DialogFragment dialog, View view) {

                            }
                        }
                );
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogHelper.setConfirmationDialogOneButton(
                        getChildFragmentManager(),
                        "How to Scan Guide",
                        "Lorem Ipsum",
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

        fabSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View view1 = view;
                DialogHelper.setConfirmationDialog(
                        getChildFragmentManager(),
                        "Are you sure?",
                        "want to submit scan result? \n" +
                                "\n" +
                                "*Please Make sure that scan result is correct",
                        getString(R.string.label_yes),
                        getString(R.string.label_no),
                        new OnDialogButtonClick() {
                            @Override
                            public void onRightButtonClick(DialogFragment dialog, View view) {
                                Toast.makeText(getActivity(),"yes",Toast.LENGTH_SHORT).show();
                                Navigation.findNavController(view1).navigate(R.id.action_rfidScanFragment_to_rfidStockTakingListFragment);
                            }

                            @Override
                            public void onLeftButtonClick(DialogFragment dialog, View view) {

                            }
                        }
                );
            }
        });

    }

    public void onBackPressed() {
        if (!Navigation.findNavController(requireView()).popBackStack()) {
            requireActivity().finish();
        }
    }
}