package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_scan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rubic.rfidimprovement.R;

import java.util.ArrayList;
import java.util.List;

public class RfidScanPrinterAdapter extends RecyclerView.Adapter<RfidScanPrinterAdapter.RfidScanPrinterViewHolder> {

    ArrayList<RfidScanPrinterData> printerList;

    public RfidScanPrinterAdapter(ArrayList<RfidScanPrinterData> printerList) {
        this.printerList = printerList;
    }

    @NonNull
    @Override
    public RfidScanPrinterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rfid_scan_list_child, parent,false);
        return new RfidScanPrinterViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RfidScanPrinterViewHolder holder, int position) {
        RfidScanPrinterData rfidScanPrinterData = printerList.get(position);
        holder.tvItemName.setText(rfidScanPrinterData.getPrinterName());
        holder.tvItemSerialNumber.setText(rfidScanPrinterData.getPrinterSerialNumber());
        holder.tvItemCondition.setText(rfidScanPrinterData.getPrinterCondition());
        holder.tvRfidNumber.setText(rfidScanPrinterData.getRfidNumber());

    }

    @Override
    public int getItemCount() {
        return printerList.size();
    }

    public static class RfidScanPrinterViewHolder extends RecyclerView.ViewHolder {
        TextView tvItemName;
        TextView tvItemSerialNumber;
        TextView tvItemCondition;
        TextView tvRfidNumber;

        CheckBox cbRfidNumber;
        CheckBox cbRfidFrontPart;
        CheckBox cbRfidTopPart;
        CheckBox cbRfidLeftPart;
        CheckBox cbRfidRightPart;

        public RfidScanPrinterViewHolder(@NonNull View itemView) {
            super(itemView);

            tvItemName = itemView.findViewById(R.id.tv_item_name);
            tvItemSerialNumber = itemView.findViewById(R.id.tv_item_serial_number);
            tvItemCondition = itemView.findViewById(R.id.tv_item_condition);
            tvRfidNumber = itemView.findViewById(R.id.tv_rfid_number);
            cbRfidNumber = itemView.findViewById(R.id.cb_rfid_number);
            cbRfidFrontPart = itemView.findViewById(R.id.cb_front_part);
            cbRfidTopPart = itemView.findViewById(R.id.cb_top_part);
            cbRfidLeftPart = itemView.findViewById(R.id.cb_left_part);
            cbRfidRightPart = itemView.findViewById(R.id.cb_right_part);
        }
    }
}
