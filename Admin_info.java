package com.company.info;

import com.company.model.CategoryRooms;
import com.company.model.Room;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Admin_info {
    //create BST
    CategoryRooms root=null;

    Scanner sc=new Scanner(System.in);

    //create or insert BST
    public void insert(){
        Room_info ri=new Room_info();

        List<Room> lst=new LinkedList<>();
        System.out.println("Enter the price :: ");
        double price=sc.nextDouble();

        System.out.println("Enter the number of rooms you want to add :: ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Room No :: "+(i+1));
            Room room=ri.data(price);
            lst.add(room);
        }

        CategoryRooms cr=new CategoryRooms(lst,price);
    }

    //delete category

    //update category

    //search category

}
