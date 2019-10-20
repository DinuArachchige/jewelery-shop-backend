package com.lk.ijse.dto;

import com.lk.ijse.entity.Gem;
import com.lk.ijse.entity.JewelryMaker;
import com.lk.ijse.entity.Metal;
import lombok.Data;

import java.util.Date;

@Data
public class JewelryMakingOrderDto {
    private int jewMDId;
    private Date givenDate;
    private MetalDto metal;
    private GemDto gem;
    private JewelryMakerDto jewelryMaker;
    private double givenMetalWeight;

    public JewelryMakingOrderDto() {
    }

    public JewelryMakingOrderDto(int jewMDId, Date givenDate, MetalDto metal, GemDto gem, JewelryMakerDto jewelryMaker, double givenMetalWeight) {
        this.jewMDId = jewMDId;
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

    public MetalDto getMetal() {
        return metal;
    }

    public void setMetal(MetalDto metal) {
        this.metal = metal;
    }

    public GemDto getGem() {
        return gem;
    }

    public void setGem(GemDto gem) {
        this.gem = gem;
    }

    public JewelryMakerDto getJewelryMaker() {
        return jewelryMaker;
    }

    public void setJewelryMaker(JewelryMakerDto jewelryMaker) {
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
        return "JewelryMakingOrderDto{" +
                "jewMDId=" + jewMDId +
                ", givenDate=" + givenDate +
                ", metal=" + metal +
                ", gem=" + gem +
                ", jewelryMaker=" + jewelryMaker +
                ", givenMetalWeight=" + givenMetalWeight +
                '}';
    }
}
