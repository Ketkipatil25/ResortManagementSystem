package com.company.model;

public class Room {
    private int rId;
    private String uniqueId;

    //1,2,3,4,5
    private int rating;

    private double price;

    //single , double triple , Queen sized, king sized , twin , hollywood twin room , double double , studio , Suite , Presidential suite
    private String beds;
    private String usageStatus;
    private boolean isAC;

    //deluxe , super deluxe
    private String speciality;

    private String description;

    private Customer c;

    public Room(int rId, String uniqueId, int rating, double price, String beds, String usageStatus, boolean isAC, String speciality, String description) {
        this.rId = rId;
        this.uniqueId = uniqueId;
        this.rating = rating;
        this.price = price;
        this.beds = beds;
        this.usageStatus = usageStatus;
        this.isAC = isAC;
        this.speciality = speciality;
        this.description = description;
        c=null;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public String getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
    }

    public boolean isAC() {
        return isAC;
    }

    public void setAC(boolean AC) {
        isAC = AC;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }
}

