package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone () {
    this.serialNumber = 0;
    this.model = " ";
    this.carrier = " ";
    this.phoneNumber = " ";
    this.owner = " ";

}
    public int getSerialNumber(int serialNumber) {
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getModel(String model) {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getCarrier(String carrier){
        return this.carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;

    }
    public String getPhoneNumber(String phoneNumber) {
        return this.phoneNumber;
    }
    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }
    public String getOwner(String owner){
        return this.owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}

