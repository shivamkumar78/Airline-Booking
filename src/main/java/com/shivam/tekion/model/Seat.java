package com.shivam.tekion.model;

enum SEAT{
    NORMAL,
    BUSINESS
}
public class Seat {

    private SEAT type;
    private String id;
    public Customer customer;
    public int price;

    
    public SEAT getType() {
        return type;
    }
    public void setType(SEAT type) {
        this.type = type;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
