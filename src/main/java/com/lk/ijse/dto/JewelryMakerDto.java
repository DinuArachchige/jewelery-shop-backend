package com.lk.ijse.dto;

import lombok.Data;

@Data
public class JewelryMakerDto {
    private int jewMId;
    private String jewMName;
    private int contactNo;

    public JewelryMakerDto() {
    }

    public JewelryMakerDto(int jewMId, String jewMName, int contactNo) {
        this.jewMId = jewMId;
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

    @Override
    public String toString() {
        return "JewelryMakerDto{" +
                "jewMId=" + jewMId +
                ", jewMName='" + jewMName + '\'' +
                ", contactNo=" + contactNo +
                '}';
    }
}
