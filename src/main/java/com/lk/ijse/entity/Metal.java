package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Metal {
    @Id
    @GeneratedValue
    private int metalId;
    private String metalType;
    private int carat;
    private double weight;
    private Date addedDate;

    @OneToMany(mappedBy = "metal", cascade = CascadeType.ALL)
    private List<JewelryMakingOrder> jewelryMakingOrders = new ArrayList<>();

    public Metal() {
    }

    public Metal(String metalType, int carat, double weight, Date addedDate) {
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

    public List<JewelryMakingOrder> getJewelryMakingOrders() {
        return jewelryMakingOrders;
    }

    public void setJewelryMakingOrders(List<JewelryMakingOrder> jewelryMakingOrders) {
        this.jewelryMakingOrders = jewelryMakingOrders;
    }

    @Override
    public String toString() {
        return "Metal{" +
                "metalId=" + metalId +
                ", metalType='" + metalType + '\'' +
                ", carat=" + carat +
                ", weight=" + weight +
                ", addedDate=" + addedDate +
                ", jewelryMakingOrders=" + jewelryMakingOrders +
                '}';
    }
}
