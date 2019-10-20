package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Data
public class JewelryMakingOrder {
    @Id
    @GeneratedValue
    private int jewMDId;
    private Date givenDate;

    @ManyToOne
    private Metal metal;

    @ManyToOne
    private Gem gem;

    @ManyToOne
    private JewelryMaker jewelryMaker;

    private double givenMetalWeight;

    public JewelryMakingOrder() {
    }

    public JewelryMakingOrder(Date givenDate, Metal metal, Gem gem, JewelryMaker jewelryMaker, double givenMetalWeight) {
        this.givenDate = givenDate;
        this.metal = metal;
        this.gem = gem;
        this.jewelryMaker = jewelryMaker;
        this.givenMetalWeight = givenMetalWeight;
    }

    public int getJewMDId() {
        return jewMDId;
    }

    public void setJewMDId(int jewMDId) {
        this.jewMDId = jewMDId;
    }

    public Date getGivenDate() {
        return givenDate;
    }

    public void setGivenDate(Date givenDate) {
        this.givenDate = givenDate;
    }

    public Metal getMetal() {
        return metal;
    }

    public void setMetal(Metal metal) {
        this.metal = metal;
    }

    public Gem getGem() {
        return gem;
    }

    public void setGem(Gem gem) {
        this.gem = gem;
    }

    public JewelryMaker getJewelryMaker() {
        return jewelryMaker;
    }

    public void setJewelryMaker(JewelryMaker jewelryMaker) {
        this.jewelryMaker = jewelryMaker;
    }

    public double getGivenMetalWeight() {
        return givenMetalWeight;
    }

    public void setGivenMetalWeight(double givenMetalWeight) {
        this.givenMetalWeight = givenMetalWeight;
    }

    @Override
    public String toString() {
        return "JewelryMakingOrder{" +
                "jewMDId=" + jewMDId +
                ", givenDate=" + givenDate +
                ", metal=" + metal +
                ", gem=" + gem +
                ", jewelryMaker=" + jewelryMaker +
                ", givenMetalWeight=" + givenMetalWeight +
                '}';
    }
}
