package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_scan;

public class RfidScanData {

    private String rackNumber;

    public String getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(String rackNumber) {
        this.rackNumber = rackNumber;
    }

    public RfidScanData(String rackNumber) {
        this.rackNumber = rackNumber;
    }
}
