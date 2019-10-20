package com.lk.ijse.dto;

import lombok.Data;

import java.util.Date;

@Data
public class GemDto {
    private int gemId;
    private String gemType;
    private int carat;
    private double weight;
    private Date addedDate;
    private Date givenDate;

    public GemDto() {
    }

    public GemDto(int gemId, String gemType, int carat, double weight, Date addedDate, Date givenDate) {
        this.gemId = gemId;
        this.gemType = gemType;
        this.carat = carat;
        this.weight = weight;
        this.addedDate = addedDate;
        this.givenDate = givenDate;
    }

    public int getGemId() {
        return gemId;
    }

    public void setGemId(int gemId) {
        this.gemId = gemId;
    }

    public String getGemType() {
        return gemType;
    }

    public void setGemType(String gemType) {
        this.gemType = gemType;
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

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    @Override
    public String toString() {
        return "GemDto{" +
                "gemId=" + gemId +
                ", gemType='" + gemType + '\'' +
                ", carat=" + carat +
                ", weight=" + weight +
                ", addedDate=" + addedDate +
                ", givenDate=" + givenDate +
                '}';
    }
}
