package com.rubic.rfidimprovement.feature.stock_taking_rfid.rfid_scan;

public class RfidScanPrinterData {

    private String printerName;

    private String printerSerialNumber;

    private String printerCondition;

    private String rfidNumber;

    private String rfidMainPartNumber;

    private String rfidFrontPartNumber;

    private String rfidTopPartNumber;

    private String rfidLeftPartNumber;

    private String rfidRightPartNumber;

    public String getPrinterName() {
        return printerName;
    }

    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    public String getPrinterSerialNumber() {
        return printerSerialNumber;
    }

    public void setPrinterSerialNumber(String printerSerialNumber) {
        this.printerSerialNumber = printerSerialNumber;
    }

    public String getPrinterCondition() {
        return printerCondition;
    }

    public void setPrinterCondition(String printerCondition) {
        this.printerCondition = printerCondition;
    }

    public String getRfidNumber() {
        return rfidNumber;
    }

    public void setRfidNumber(String rfidNumber) {
        this.rfidNumber = rfidNumber;
    }

    public String getRfidMainPartNumber() {
        return rfidMainPartNumber;
    }

    public void setRfidMainPartNumber(String rfidMainPartNumber) {
        this.rfidMainPartNumber = rfidMainPartNumber;
    }

    public String getRfidFrontPartNumber() {
        return rfidFrontPartNumber;
    }

    public void setRfidFrontPartNumber(String rfidFrontPartNumber) {
        this.rfidFrontPartNumber = rfidFrontPartNumber;
    }

    public String getRfidTopPartNumber() {
        return rfidTopPartNumber;
    }

    public void setRfidTopPartNumber(String rfidTopPartNumber) {
        this.rfidTopPartNumber = rfidTopPartNumber;
    }

    public String getRfidLeftPartNumber() {
        return rfidLeftPartNumber;
    }

    public void setRfidLeftPartNumber(String rfidLeftPartNumber) {
        this.rfidLeftPartNumber = rfidLeftPartNumber;
    }

    public String getRfidRightPartNumber() {
        return rfidRightPartNumber;
    }

    public void setRfidRightPartNumber(String rfidRightPartNumber) {
        this.rfidRightPartNumber = rfidRightPartNumber;
    }

    public RfidScanPrinterData(String printerName, String printerSerialNumber, String printerCondition,
                               String rfidNumber, String rfidMainPartNumber, String rfidFrontPartNumber,
                               String rfidTopPartNumber, String rfidLeftPartNumber, String rfidRightPartNumber) {
        this.printerName = printerName;
        this.printerSerialNumber = printerSerialNumber;
        this.printerCondition = printerCondition;
        this.rfidNumber = rfidNumber;
        this.rfidMainPartNumber = rfidMainPartNumber;
        this.rfidFrontPartNumber = rfidFrontPartNumber;
        this.rfidTopPartNumber = rfidTopPartNumber;
        this.rfidLeftPartNumber = rfidLeftPartNumber;
        this.rfidRightPartNumber = rfidRightPartNumber;
    }
}
