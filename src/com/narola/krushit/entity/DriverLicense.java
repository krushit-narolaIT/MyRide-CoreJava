package com.narola.krushit.entity;

import java.util.Date;

public class DriverLicense {
    private int licenseId;
    private int driverId;
    private String licenseNumber;
    private Date issueDate;
    private Date expiryDate;
    private String registeredState;

    public DriverLicense(int licenseId, String stateAbbreviation, int stateCode, Date issueDate, Date expiryDate) {
        this.licenseId = licenseId;
        this.registeredState = stateAbbreviation + stateCode;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;

        this.licenseNumber = generateLicenseNumber(stateAbbreviation, stateCode, issueDate);
    }

    // Method to generate license number
    // Format: XXYY YYYYMMDDXXXXX
    private String generateLicenseNumber(String stateAbbreviation, int stateCode, Date issueDate) {
        String year = String.format("%tY", issueDate);
        String uniqueId = String.format("%05d", licenseId);
        return stateAbbreviation + stateCode + " " + year + uniqueId;
    }

    public int getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(int licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        if (expiryDate.after(issueDate)) {
            this.expiryDate = expiryDate;
        } else {
            throw new IllegalArgumentException("Expiry date must be greater than issue date.");
        }
    }

    public String getRegisteredState() {
        return registeredState;
    }

    public void setRegisteredState(String stateAbbreviation, int stateCode) {
        this.registeredState = stateAbbreviation + stateCode;
        this.licenseNumber = generateLicenseNumber(stateAbbreviation, stateCode, this.issueDate); // Regenerate license number
    }

    @Override
    public String toString() {
        return "DriverLicense [ " +
                "License Id=" + licenseId +
                ", License Number='" + licenseNumber + '\'' +
                ", Issue Date=" + issueDate +
                ", Expiry Date=" + expiryDate +
                ", Registered State='" + registeredState + '\'' +
                " ]";
    }
}
