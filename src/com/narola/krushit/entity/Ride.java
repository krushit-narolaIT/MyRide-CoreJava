package com.narola.krushit.entity;

import java.sql.Timestamp;

public class Ride {
    private int id;
    private int userId;
    private int driverId;
    private String status;
    private Timestamp startTime;
    private Timestamp endTime;

    public Ride(int id, int userId, int driverId, String status, Timestamp startTime, Timestamp endTime) {
        this.id = id;
        this.userId = userId;
        this.driverId = driverId;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", userId=" + userId +
                ", driverId=" + driverId +
                ", status='" + status + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
