package com.company.info;

import com.company.model.CategoryRooms;
import com.company.model.Room;

import java.util.LinkedList;
import java.util.List;

public class ReceiptionistInfo {

    List<Double> lst;
    //get data all room type // category
    public List<Room> getCategoryRoom(CategoryRooms root){
        List<Room> lst=new LinkedList<>();
        //data display / data add in list(inorder)
        return lst;
    }

    //booking data
    //display rooms price range

    public Room display(CategoryRooms root){
        Room r=null;
        //inorder
        //500 700 1000 1400 1500 2500 list of prices
        //low to high / high to low

        //different method

        //lst=inorder(root)


        switch (1){
            case 1:{
                for(int i=0;i<3;i++){
                   r=search(lst.get(i),root);
                   if(r!=null){
                       break;
                   }
                }
            }
        }


        return r;

    }

    public Room search(Double price,CategoryRooms root)
    {
        //search

        return null;
    }

    public void inorder(CategoryRooms root){
        if(root!=null){

        }
    }
}
