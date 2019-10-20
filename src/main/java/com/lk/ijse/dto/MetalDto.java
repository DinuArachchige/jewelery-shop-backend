package com.lk.ijse.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MetalDto {
    private int metalId;
    private String metalType;
    private int carat;
    private double weight;
    private Date addedDate;

    public MetalDto() {
    }

    public MetalDto(int metalId, String metalType, int carat, double weight, Date addedDate) {
        this.metalId = metalId;
        this.metalType = metalType;
        this.carat = carat;
        this.weight = weight;
        this.addedDate = addedDate;
    }

    public int getMetalId() {
        return metalId;
    }

    public void setMetalId(int metalId) {
        this.metalId = metalId;
    }

    public String getMetalType() {
        return metalType;
    }

    public void setMetalType(String metalType) {
        this.metalType = metalType;
    }

    public int getCarat() {
        return carat;
    }

    public void setCarat(int carat) {
        this.carat = carat;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "MetalDto{" +
                "metalId=" + metalId +
                ", metalType='" + metalType + '\'' +
                ", carat=" + carat +
                ", weight=" + weight +
                ", addedDate=" + addedDate +
                '}';
    }
}
