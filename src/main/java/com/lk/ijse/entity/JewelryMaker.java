package com.lk.ijse.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class JewelryMaker {
    @Id
    @GeneratedValue
    private int jewMId;
    private String jewMName;
    private int contactNo;

    @OneToMany(mappedBy = "jewelryMaker", cascade = CascadeType.ALL)
    private List<JewelryMakingOrder> jewelryMakingOrders = new ArrayList<>();

    public JewelryMaker() {
    }

    public JewelryMaker(String jewMName, int contactNo) {
        this.jewMName = jewMName;
        this.contactNo = contactNo;
    }

    public int getJewMId() {
        return jewMId;
    }

    public void setJewMId(int jewMId) {
        this.jewMId = jewMId;
    }

    public String getJewMName() {
        return jewMName;
    }

    public void setJewMName(String jewMName) {
        this.jewMName = jewMName;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public List<JewelryMakingOrder> getJewelryMakingOrders() {
        return jewelryMakingOrders;
    }

    public void setJewelryMakingOrders(List<JewelryMakingOrder> jewelryMakingOrders) {
        this.jewelryMakingOrders = jewelryMakingOrders;
    }

    @Override
    public String toString() {
        return "JewelryMaker{" +
                "jewMId=" + jewMId +
                ", jewMName='" + jewMName + '\'' +
                ", contactNo=" + contactNo +
                ", jewelryMakingOrders=" + jewelryMakingOrders +
                '}';
    }
}
