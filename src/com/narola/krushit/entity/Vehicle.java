package com.narola.krushit.entity;

public class Vehicle {
    private int vehicle_id;
    private String vehicle_type;
    private String vehicle_category;

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public String getVehicle_category() {
        return vehicle_category;
    }

    public void setVehicle_category(String vehicle_category) {
        this.vehicle_category = vehicle_category;
    }

    @Override
    public String toString() {
        return "Vehicle [" +
                "Vehicle Id=" + vehicle_id +
                ", Vehicle Type='" + vehicle_type + '\'' +
                ", Vehicle Category='" + vehicle_category + '\'' +
                " ]";
    }
}
