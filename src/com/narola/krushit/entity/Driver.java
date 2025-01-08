package com.narola.krushit.entity;

public class Driver {
    private int id;
    private String driverPass;
    private String driverFirstName;
    private String driverLastName;
    private String driverEmail;
    private String driverPhone;
    private boolean available;
    private int vehicleId;
    private int licenseId;

    public Driver(int id, String driverPass, String driverFirstName, String driverLastName, String driverEmail, String driverPhone, boolean available, int vehicleId, int licenseId) {
        this.id = id;
        this.driverPass = driverPass;
        this.driverFirstName = driverFirstName;
        this.driverLastName = driverLastName;
        this.driverEmail = driverEmail;
        this.driverPhone = driverPhone;
        this.available = available;
        this.vehicleId = vehicleId;
        this.licenseId = licenseId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriverPass() {
        return driverPass;
    }

    public void setDriverPass(String driverPass) {
        this.driverPass = driverPass;
    }

    public String getDriverFirstName() {
        return driverFirstName;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public String getDriverLastName() {
        return driverLastName;
    }

    public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(int licenseId) {
        this.licenseId = licenseId;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", driverPass='" + driverPass + '\'' +
                ", driverFirstName='" + driverFirstName + '\'' +
                ", driverLastName='" + driverLastName + '\'' +
                ", driverEmail='" + driverEmail + '\'' +
                ", driverPhone='" + driverPhone + '\'' +
                ", available=" + available +
                ", vehicleId=" + vehicleId +
                ", licenseId=" + licenseId +
                '}';
    }
}
