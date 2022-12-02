package com.company.model;

import java.util.LinkedList;
import java.util.List;

public class Customer {
    private int cId;
    private String fname;
    private String lname;
    private String city;
    private String phNo;
    private String email;
    private String adhharNo;

    private List<Room> lst;

    public Customer(int cId, String fname, String lname, String city, String phNo, String email, String adhharNo) {
        this.cId = cId;
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.phNo = phNo;
        this.email = email;
        this.adhharNo = adhharNo;
        this.lst =new  LinkedList<>();
    }


    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdhharNo() {
        return adhharNo;
    }

    public void setAdhharNo(String adhharNo) {
        this.adhharNo = adhharNo;
    }

    public List<Room> getLst() {
        return lst;
    }

    public void setLst(List<Room> lst) {
        this.lst = lst;
    }
}
