import javax.print.event.PrintEvent;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
        System.out.println("liskedList started");
    }

    void insertB(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            this.display();
        } else {
            temp.next = head;
            head = temp;
            this.display();
        }
    }

    void insertE(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            this.display();
        } else {
            Node duplicate = head;

            while (duplicate.next != null) {
                duplicate = duplicate.next;
            }
            duplicate.next = temp;
            this.display();
            // duplicate = null;

        }

    }

    void deleteB() {
        if (head == null) {
            this.display();
        } else {
            if (head.next == null) {
                head = null;
                this.display();

            } else {
                head = head.next;
                this.display();
            }
        }

    }

    void deleteE() {
        if (head == null) {
            this.display();
        } else {
            if (head.next == null) {
                head = null;
                this.display();
            } else {
                Node duplicate = head;

                while (duplicate.next.next != null) {

                    duplicate = duplicate.next;

                }

                duplicate.next = null;
                this.display();

            }
        }

    }

    void display() {
        Node duplicate = head;
        if (duplicate == null) {
            System.out.println();
            System.out.print("Linkedlist is empty");

        } else {

            while (duplicate.next != null) {
                System.out.print(duplicate.data + "\t");
                duplicate = duplicate.next;
            }
            if (duplicate.next == null) {
                System.out.print(duplicate.data + "\t");

            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Press 1 for InsertBeginning \nPress 2 for InsertEnd\nPress 3 for DeleteBeginning\nPress 4 for DeleteEnd\nPress 5 for Display  ");
        while (true) {
            System.out.print("enter your choice");
            int a = sc.nextInt();
            switch (a) {

                case 1:

                    obj.insertB(sc.nextInt());
                    break;
                case 2:
                    obj.insertE(sc.nextInt());
                    break;
                case 3:
                    obj.deleteB();
                    break;
                case 4:
                    obj.deleteE();
                    break;
                case 5:
                    obj.display();
                    break;
                case 6:
                    sc.close();
                    System.exit(0);

            }
        }

    }
}