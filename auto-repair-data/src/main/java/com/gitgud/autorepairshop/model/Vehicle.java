package com.gitgud.autorepairshop.model;

import java.time.LocalDateTime;

public class Vehicle {

    private LocalDateTime yearBuilt;
    private double engineSize;
    private String transmissionType;

    public LocalDateTime getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(LocalDateTime yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
}
