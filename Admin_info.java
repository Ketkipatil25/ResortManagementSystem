package com.company.info;

import com.company.model.CategoryRooms;
import com.company.model.Room;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.io.*;


public class Admin_info {
    //create BST
    CategoryRooms root = null;
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);

    static Scanner sc = new Scanner(System.in);

    //create or insert BST
    public void insert() throws IOException {
//        Room_info ri=new Room_info();
        List<Room> lst = new LinkedList<>();

        do {
            System.out.println("Enter the number of rooms you want to add :: ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Room r1 = new Room();
                System.out.println("Enter the Room Id:");
                int temp_id = sc.nextInt();
                r1.setrId(temp_id);
                System.out.println("Enter the Room Unique Id:");
                String temp_uniqueid = br.readLine();
                r1.setUniqueId(temp_uniqueid);
                System.out.println("Enter the Rating of the Room:");
                int temp_rating = sc.nextInt();
                r1.setRating(temp_rating);
                System.out.println("Enter the Number of the Beds:");
                int temp_beds = sc.nextInt();
                r1.setBeds(temp_beds);
                System.out.println("Enter the if it is Ac Or Not:");
                boolean temp_isAc = sc.nextBoolean();
                r1.setAC(temp_isAc);
//Room(int rId, String uniqueId, int rating, double price, String beds, String usageStatus, boolean isAC, ...)   Room()

//                System.out.println("Room No :: " + (i + 1));
//                Room room = ri.data(price);
                lst.add(r1);
            }
            CategoryRooms ptr = new CategoryRooms();
            ptr.setLst(lst);
            System.out.println("Enter the price of the room:");
            double temp_price = sc.nextDouble();
            ptr.setPrice(temp_price);
            CategoryRooms cur;
            if (root == null) {
                ptr.setLeft(null);
                ptr.setRight(null);
                root = ptr;
                System.out.println("Inserted the root");
            } else {
                cur = root;
                ptr.setLeft(null);
                ptr.setRight(null);
                while (cur != null) {
                    if (cur.getPrice() > ptr.getPrice()) {
                        if (cur.getLeft() == null) {
                            cur.setLeft(ptr);
                            break;
                        } else {
                            cur = cur.getLeft();
                        }
                    } else {
                        if (cur.getRight() == null) {
                            cur.setRight(ptr);
                            break;
                        } else {
                            cur = cur.getRight();
                        }
                    }


                }


//            CategoryRooms cr = new CategoryRooms(lst, price);
            }
            System.out.println("\n\tDo you want to add more rooms:\n\tpress 1:");
        } while (sc.nextInt() == 1);
    }

    //delete category
    public void deletion(CategoryRooms cur, int ele) {
        if (root == null) {
            System.out.println("*******No Rooms******");
        } else {
            CategoryRooms parent = null;
            cur = root;

            while (cur != null && cur.getPrice() != ele) {
                parent = cur;
                if (cur.getPrice() > ele) {
                    cur = cur.getLeft();
                } else {
                    cur = cur.getRight();
                }

            }
            if (cur == null) {
                System.out.println("data " + ele + " Not found");
            } else {
//                cur is the node to be deleted
                if (cur.getRight() == null && cur.getLeft() == null) {
                    if (parent == null) {
                        root = null;
                        cur = null;
                        System.out.println("Deleted The only node");
                    } else {
                        if (parent.getPrice() > ele) {
                            parent.setLeft(null);
                        } else {
                            parent.setRight(null);
                        }

                        System.out.println("Deleted" + cur.getPrice());
                        cur = null;
                    }
                } else if (cur.getLeft() != null && cur.getRight() == null) {
                    if (parent == null) {
//                        root is the node to delete and therfore parent ==null
                        root = parent.getLeft();
                        cur.setLeft(null);
                        cur = null;
                    } else {
                        if (parent.getPrice() > ele) {
//                        node (left subtree) to delete is present on the left side
                            parent.setLeft(cur.getLeft());
                            cur.setLeft(null);
                            cur = null;
                        } else {
//                        node to be deleted(left subtree ) is present on the right side of the root
                            parent.setRight(cur.getLeft());
                            cur.setLeft(null);
                            cur = null;
                        }
                    }
                } else if (cur.getRight() != null && cur.getLeft() == null) {
                    if (parent == null) {
                        root = parent.getRight();
                        cur.setRight(null);
                        cur = null;
                    } else {
                        if (parent.getPrice() < ele) {
//                            node to be deleted(right subtree) is to be found on the right side of the root
                            parent.setRight(cur.getRight());
                            cur.setRight(null);
                            cur = null;
                        } else {
//                            node to be deleted(right subtree) is to be found on the left side of the root
                            parent.setLeft(cur.getRight());
                            cur.setRight(null);
                            cur = null;
                        }
                    }
                } else if (cur.getRight() != null && cur.getLeft() != null) {
                    CategoryRooms temp = cur.getLeft();
                    CategoryRooms parent1 = cur;
                    while (temp.getRight() != null) {
                        parent1 = temp;
                        temp = temp.getRight();
                    }

                    cur.setPrice(temp.getPrice());

                    if (parent1.getRight() == temp) {
                        if (temp.getLeft() != null) {
                            parent1.setRight(temp.getLeft());
                        } else {
                            parent1.setRight(null);
                        }
                    } else {
                        if (temp.getLeft() != null) {
                            parent1.setLeft(temp.getLeft());
                        } else {
                            parent1.setLeft(null);
                        }
                    }
                }

            }
        }
    }


    //search category
    public void searchCategory(){
        CategoryRooms cur;
            int key = sc.nextInt();
            cur = root;
            int flag = 0;
            while (cur != null) {
                if (cur.getPrice() == key) {
                    flag = 1;
                    System.out.println("Data found" + cur.getPrice());
                    break;
                }
                if (cur.getPrice() > key) {
                    cur = cur.getLeft();
                } else {
                    cur = cur.getRight();
                }
            }
            if (flag == 0) {
                System.out.println("Data not Found!");

            }
        }
    //update category
    public void updateRoom(){
        CategoryRooms cur;
        int key = sc.nextInt();
        cur = root;
        int flag = 0;
        while (cur != null) {
            if (cur.getPrice() == key) {
                flag = 1;
                CategoryRooms temp;
                System.out.println("Data found" + cur.getPrice());
                temp=cur;
                System.out.println("Enter the New Date to Update:");
                double newData=sc.nextDouble();
                temp.setPrice(newData);
                break;
            }
            if (cur.getPrice() > key) {
                cur = cur.getLeft();
            } else {
                cur = cur.getRight();
            }
        }
        if (flag == 0) {
            System.out.println("Data not Found!");

        }
    }

    public void inorder(CategoryRooms root){
        if(root!=null){
            inorder(root.getLeft());
            System.out.println(root.getLst()+" "+root.getPrice());
            inorder(root.getRight());
        }
    }
    public static void main(String[] args) throws IOException {
        Admin_info ai=new Admin_info();
        do{
            ai.insert();
            System.out.println("Do you want to add more categories press 1");
        }while (sc.nextInt()==1);
        ai.inorder(ai.root);
    }
}
