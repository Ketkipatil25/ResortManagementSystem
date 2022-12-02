import java.util.*;

class Admin {

    Scanner sc = new Scanner(System.in);
    Node root;

    public class Node {
        int room_no;
        int price;
        String room_type;
        int beds;
        Node left;
        Node right;

        Node(int room_no, int price, String room_type, int beds) {
            left = right = null;
            this.room_no = room_no;
            this.price = price;
            this.room_type = room_type;
            this.beds = beds;
        }
    }

    public void create() {
        int n1 = 1;
        do {
            System.out.println("Enter the room number:");
            int room_no = sc.nextInt();
            System.out.println("Enter the price of the rooom:");
            int price = sc.nextInt();
            System.out.println("Enter the type of room(AC or NonAC):");
            String room_type = sc.next();
            System.out.println("Enter the no. of beds:");
            int beds = sc.nextInt();
            Node temp = new Node(room_no, price, room_type, beds);
            if (root == null) {
                root = temp;
            } else {
                Node ptr = root;
                while (ptr != null) {
                    if (ptr.price > temp.price) {
                        if (ptr.left == null) {
                            ptr.left = temp;
                            break;
                        } else {
                            ptr = ptr.left;
                        }
                    } else if (ptr.price < temp.price) {
                        if (ptr.right == null) {
                            ptr.right = temp;
                            break;
                        } else {
                            ptr = ptr.right;
                        }
                    } else {
                        System.out.println("Node already present");
                        break;
                    }
                }
            }
            System.out.println("Do you want to add more rooms?\n1.Yes\n2.No");
            n1 = sc.nextInt();
        } while (n1 == 1);
    }

    public void Inorder(Node N) {
        if (root == null) {
            System.out.println("No rooms available.");
            return;
        }
        if (N != null) {
            Inorder(N.left);
            System.out.println("____________________________________________________________________________________");
            System.out.println(N.room_no + "\t\t\t" + N.price + "\t\t\t" + N.room_type + "\t\t\t" + N.beds);
            Inorder(N.right);
        }
    }

}

class Customers {
    public void RoomBook(){

    }
    public void Weddings(){
        System.out.println("Info regarding Wedding");
        System.out.println("Halls Available --> 5");
        System.out.println("Date ");


    }
    public void Anniversaries(){

    }
    public void Birthdays(){

    }
    public void Engagements(){

    }
    public void conference(){

    }



}

public class Main {
    public static void main(String args[]) {
        Admin a = new Admin();
        Customers c = new Customers();
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int p = 1;
        while (n == 1) {
            System.out.println("************Welcome to Greenland Resort************");
            System.out.println("1.Admin\n2.Customer");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter admin password to enter: ");
                    String password = sc.next();
                    if (password.equals("abc1234")) {
                        System.out.println("*********You have entered the admin page***********");

                        while (p == 1) {
                            System.out.println("1.Create rooms\n2.display");
                            System.out.println("Enter your choice:");
                            int choice1 = sc.nextInt();
                            switch (choice1) {
                                case 1:
                                    a.create();
                                    break;

                                case 2:
                                    System.out.println(
                                            "************************************Rooms Information************************************");
                                    System.out.println("Room no.\t\tRoom Price\t\tRomm type\t\tNo. of beds");
                                    a.Inorder(a.root);
                                    break;

                            }
                            System.out.println("Do you want to continue?\n1.Yes\n2.No");
                            p = sc.nextInt();
                        }
                    } else {
                        System.out.println("Invalid admin password");
                        break;
                    }

                case 2:
                    System.out.println(
                            "__________________________________________________________________________________________________________________");
                    System.out.println(
                            "|                        !!! Welcome to heavenly stay amidst the spectacular beauty !!!                           |");
                    System.out.println(
                            "|*****************************Experience world-class service at Greenland Resort**********************************| ");
                    System.out.println(
                            "|             Each room has a private bathroom equipped with a shower and a hairdryer,                            | ");
                    System.out.println(
                            "|             while selected rooms are fitted with a kitchenette fitted with a minibar.                           |");
                    System.out.println(
                            "|                      At the resort all rooms include bed linen and towels.                                      |");
                    System.out.println(
                            "|                                                                                                                 |");
                    System.out.println(
                            "|                      Our luxurious resort is perfect for all functions like                                     |");
                    System.out.println(
                            "|                    1.Wedding                 2.Anniversaries                                                    | ");
                    System.out.println(
                            "|                    3.Birthdays               4.Engagements                                                      |  ");
                    System.out.println(
                            "|                    5.Conference              6.Various Activities                                               |  ");
                    System.out.println(
                            "|_________________________________________________________________________________________________________________|");
                    
                    while (q==1){
                        System.out.println("1.Room Booking\n2.Weddings\n3.Anniversaries\n4.Birthdays\n5.Engagements\n6.Conference");
                        System.out.println("Enter your choice:");
                        int choice2 =sc.nextInt();

                        switch(choice2){
                            case 1:
                            c.RoomBook();

                            case 2:
                            c.Weddings();

                            case 3:
                            c.Anniversaries();

                            case 4:
                            c.Birthdays();

                            case 5:
                            c.Engagements();

                            case 6:
                            c.conference();
                        }
                    }
                    
            }
            System.out.println("Do you want to continue?\n1.Yes\n2.No");
            n = sc.nextInt();
        }

    }
}