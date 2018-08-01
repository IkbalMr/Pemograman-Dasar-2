package modul3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        LinkList a = new LinkList();
        Scanner in = new Scanner(System.in);
        a.print(); // should show nothing
        a.insert(new Node(5));
        a.insert(new Node(4));
        a.insert(new Node(7));
        a.insert(new Node(6));
        a.print(); // should show 4 5 6 7
        a.delete(a.head);
        a.print(); // should show 5 6 7
        a.delete(a.tail.prev);
        a.print(); // should show 5 7
        a.delete(a.tail);
        a.print(); // should show 5
        a.delete(a.head);
        a.print(); // should show nothing
//        a.print();
//        System.out.println("DATA ASLI");
//        a.insert(new Node(5));
//        a.insert(new Node(4));
//        a.insert(new Node(7));
//        a.insert(new Node(6));
//        a.insert(new Node(8));
//        a.insert(new Node(3));
//        a.insert(new Node(1));
//        a.insert(new Node(2));
//        a.insert(new Node(10));
//        a.insert(new Node(9));
//        a.insert(new Node(11));
//        a.print();
//        System.out.println("PILIH SORTING : ");
//        System.out.println("1. BUBBLE SORT");
//        System.out.println("2. QUICK SORT");
//        System.out.print("PILIH : ");
//        int pilih = in.nextInt();
//        if (pilih == 1) {
//            System.out.println("BUBBLE SORT");
//            a.bubble_sort();
//            a.print();
//        } else if (pilih == 2) {
//            System.out.println("QUICK SORT");
//            a.quick_sort();
//            a.print();
//        } else {
//            System.out.println("pilihan tidak tersedia !");
//        }
    }
}
