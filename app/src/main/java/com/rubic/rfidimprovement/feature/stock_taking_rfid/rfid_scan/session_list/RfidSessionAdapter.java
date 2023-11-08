package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_scan.session_list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rubic.rfidimprovement.R;
import com.rubic.rfidimprovement.domain.datamodel.GetSessionActiveModel;
import com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_scan.RfidScanAdapter;

import java.util.ArrayList;

public class RfidSessionAdapter extends RecyclerView.Adapter<RfidSessionAdapter.RfidSessionViewHolder> {

    private ArrayList<GetSessionActiveModel> dataList;

    public RfidSessionAdapter(ArrayList<GetSessionActiveModel> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RfidSessionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_printer_stock_taking, parent, false);
        return new RfidSessionViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RfidSessionViewHolder holder, int position) {
        GetSessionActiveModel getSessionActiveModel = dataList.get(position);

        holder.tvItemStPicOne.setText(getSessionActiveModel.getPic1Id());
        holder.tvItemStPicTwo.setText(getSessionActiveModel.getPic2Id());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class RfidSessionViewHolder extends RecyclerView.ViewHolder{
        TextView tvItemStPeriod;
        TextView tvItemStPicOne;
        TextView tvItemStPicTwo;
        TextView tvItemStStart;
        TextView tvItemStFinish;
        TextView tvItemStScanned;

        public RfidSessionViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItemStPeriod = itemView.findViewById(R.id.tv_item_st_period);
            tvItemStPicOne = itemView.findViewById(R.id.tv_item_st_pic_one);
            tvItemStPicTwo = itemView.findViewById(R.id.tv_item_st_pic_two);
            tvItemStStart = itemView.findViewById(R.id.tv_item_st_start);
            tvItemStFinish = itemView.findViewById(R.id.tv_item_st_finish);
            tvItemStScanned = itemView.findViewById(R.id.tv_item_st_scanned);

        }
    }


}
