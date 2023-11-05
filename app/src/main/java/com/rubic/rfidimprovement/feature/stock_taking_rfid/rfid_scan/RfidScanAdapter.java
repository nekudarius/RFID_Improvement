package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_scan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rubic.rfidimprovement.R;

import java.util.ArrayList;
import java.util.List;

public class RfidScanAdapter extends RecyclerView.Adapter<RfidScanAdapter.RfidScanViewHolder> {

    private List<RfidScanData> rackList;

    private Activity activity;
    private ArrayList<RfidScanData> rackListV2;
    private ArrayList<RfidScanPrinterData> printerListV2;

    public RfidScanAdapter(Activity activity, ArrayList<RfidScanData> rackListV2, ArrayList<RfidScanPrinterData> printerListV2) {
        this.activity = activity;
        this.rackListV2 = rackListV2;
        this.printerListV2 = printerListV2;
    }

//        public RfidScanAdapter(List<RfidScanData> rackList) {
//        this.rackList = rackList;
//    }

    @NonNull
    @Override
    public RfidScanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rfid_scan_list_parent, parent, false);
        return new RfidScanViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RfidScanViewHolder holder, int position) {
//        RfidScanData rfidScanData = rackList.get(position);
//        holder.tvRackLocation.setText(rfidScanData.getRackNumber());

        RfidScanData rfidScanData = rackListV2.get(position);
        holder.tvRackLocation.setText(rfidScanData.getRackNumber());

        RfidScanPrinterAdapter rfidScanPrinterAdapter = new RfidScanPrinterAdapter(printerListV2);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false);
        holder.rvChild.setLayoutManager(linearLayoutManager);
        holder.rvChild.setAdapter(rfidScanPrinterAdapter);


    }

    @Override
    public int getItemCount() {

//        return rackList.size();
        return rackListV2.size();
    }

    public static class RfidScanViewHolder extends RecyclerView.ViewHolder{
        TextView tvRackLocation;
        RecyclerView rvChild;

        public RfidScanViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRackLocation = itemView.findViewById(R.id.tv_rack_location);
            rvChild = itemView.findViewById(R.id.rv_child);
        }
    }
}
