package com.tes.12.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mobileNumber;
    private int crifScore;
    private double familyIncome;
    private boolean ekycCkyc;
    private String spouseData;
    private String verifiedDOB;
    private int minSumAssured;
    private boolean eligibility;
    private boolean dataPush;
    private String COI;
    private boolean COIDownloadAPI;
    private boolean COIShared;
    private boolean reverseFeed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getCrifScore() {
        return crifScore;
    }

    public void setCrifScore(int crifScore) {
        this.crifScore = crifScore;
    }

    public double getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(double familyIncome) {
        this.familyIncome = familyIncome;
    }

    public boolean isEkycCkyc() {
        return ekycCkyc;
    }

    public void setEkycCkyc(boolean ekycCkyc) {
        this.ekycCkyc = ekycCkyc;
    }

    public String getSpouseData() {
        return spouseData;
    }

    public void setSpouseData(String spouseData) {
        this.spouseData = spouseData;
    }

    public String getVerifiedDOB() {
        return verifiedDOB;
    }

    public void setVerifiedDOB(String verifiedDOB) {
        this.verifiedDOB = verifiedDOB;
    }

    public int getMinSumAssured() {
        return minSumAssured;
    }

    public void setMinSumAssured(int minSumAssured) {
        this.minSumAssured = minSumAssured;
    }

    public boolean isEligibility() {
        return eligibility;
    }

    public void setEligibility(boolean eligibility) {
        this.eligibility = eligibility;
    }

    public boolean isDataPush() {
        return dataPush;
    }

    public void setDataPush(boolean dataPush) {
        this.dataPush = dataPush;
    }

    public String getCOI() {
        return COI;
    }

    public void setCOI(String COI) {
        this.COI = COI;
    }

    public boolean isCOIDownloadAPI() {
        return COIDownloadAPI;
    }

    public void setCOIDownloadAPI(boolean COIDownloadAPI) {
        this.COIDownloadAPI = COIDownloadAPI;
    }

    public boolean isCOIShared() {
        return COIShared;
    }

    public void setCOIShared(boolean COIShared) {
        this.COIShared = COIShared;
    }

    public boolean isReverseFeed() {
        return reverseFeed;
    }

    public void setReverseFeed(boolean reverseFeed) {
        this.reverseFeed = reverseFeed;
    }
}