package com.example.demo.model;

import java.util.Date;

public class Bill {
    private int id;
    private int CustomerId;
    private Date billDate;
    private Double billAmount;
    private Double paidAmount;
    private Date paidDate = null;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", CustomerId=" + CustomerId +
                ", billDate=" + billDate +
                ", billAmount=" + billAmount +
                ", paidAmount=" + paidAmount +
                ", paidDate=" + paidDate +
                '}';
    }
}
