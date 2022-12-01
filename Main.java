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
            System.out.println("______________________________________________________________________________");
            System.out.println(N.room_no + "\t\t\t" + N.price + "\t\t\t" + N.room_type + "\t\t\t" + N.beds);
            Inorder(N.right);
        }
    }

}

class Customers {

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

            while (p == 1) {
                switch (choice) {
                    case 1:
                        System.out.println("Enter admin password to enter: ");
                        String password = sc.next();
                        if (password.equals("abc1234")) {
                            System.out.println("*********You have entered the admin page***********");
                            System.out.println("1.Create rooms\n2.display");
                            System.out.println("Enter your choice:");
                            int choice1 = sc.nextInt();
                            switch (choice1) {
                                case 1:
                                    a.create();
                                    break;

                                case 2:
                                    System.out.println(
                                            "********************************Rooms Information********************************");
                                    System.out.println("Room no.\t\tRoom Price\t\tRomm type\t\tNo. of beds");
                                    a.Inorder(a.root);
                                    break;

                            }
                        } else {
                            System.out.println("Invalid admin password");
                        }
                }
                System.out.println("Do you want to continue?\n1.Yes\n2.No");
                p = sc.nextInt();
            }
        }

    }
}