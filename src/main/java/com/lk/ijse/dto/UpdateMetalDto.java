package com.lk.ijse.dto;

import lombok.Data;

@Data
public class UpdateMetalDto {
    private int metalId;
    private double updatedWeight;

    public UpdateMetalDto() {
    }

    public UpdateMetalDto(int metalId, double updatedWeight) {
        this.metalId = metalId;
        this.updatedWeight = updatedWeight;
    }

    public int getMetalId() {
        return metalId;
    }

    public void setMetalId(int metalId) {
        this.metalId = metalId;
    }

    public double getUpdatedWeight() {
        return updatedWeight;
    }

    public void setUpdatedWeight(double updatedWeight) {
        this.updatedWeight = updatedWeight;
    }

    @Override
    public String toString() {
        return "UpdateMetalDto{" +
                "metalId=" + metalId +
                ", updatedWeight=" + updatedWeight +
                '}';
    }
}
