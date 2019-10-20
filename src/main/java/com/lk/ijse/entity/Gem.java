package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Gem {
    @Id
    @GeneratedValue
    private int gemId;
    private String gemType;
    private int carat;
    private double weight;
    private Date addedDate;
    private Date givenDate;

    @OneToMany(mappedBy = "gem", cascade = CascadeType.ALL)
    private List<JewelryMakingOrder> jewelryMakingOrders = new ArrayList<>();

    public Gem() {
    }

    public Gem(String gemType, int carat, double weight, Date addedDate, Date givenDate) {
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

    public List<JewelryMakingOrder> getJewelryMakingOrders() {
        return jewelryMakingOrders;
    }

    public void setJewelryMakingOrders(List<JewelryMakingOrder> jewelryMakingOrders) {
        this.jewelryMakingOrders = jewelryMakingOrders;
    }

    @Override
    public String toString() {
        return "Gem{" +
                "gemId=" + gemId +
                ", gemType='" + gemType + '\'' +
                ", carat=" + carat +
                ", weight=" + weight +
                ", addedDate=" + addedDate +
                ", givenDate=" + givenDate +
                ", jewelryMakingOrders=" + jewelryMakingOrders +
                '}';
    }
}
