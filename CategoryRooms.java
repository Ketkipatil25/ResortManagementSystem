package com.company.model;

import java.util.List;
public class CategoryRooms {
    private List<Room> lst;
    private double price;
    CategoryRooms left;
    CategoryRooms right;

    public CategoryRooms(List<Room> lst, double price) {
        this.lst = lst;
        this.price = price;
        left=null;
        right=null;
    }

    public List<Room> getLst() {
        return lst;
    }

    public void setLst(List<Room> lst) {
        this.lst = lst;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
