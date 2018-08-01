package modul4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkList a = new LinkList();
        Scanner input = new Scanner(System.in);
        boolean henti = true;
        String ulg;
        while(henti){
            System.out.print("Masukkan Data Antrian : ");
            int data = input.nextInt();
            a.push(new Node(data));
            System.out.print("Masukkan lagi ? : ");
            String tny = input.next();
            if(tny.equalsIgnoreCase("N")){
                henti = false;
            }
        }
        do{
            a.print();
            System.out.println("Pilih jenis antrian");
            System.out.println("1.Stack");
            System.out.println("2.Queue");
            System.out.print("Pilih : ");
            int pilih = input.nextInt();
            String proses;
            if(pilih == 1){
                System.out.print("Proses [Y/N]: ");
                proses = input.next();
                if(proses.equalsIgnoreCase("Y")){
                    System.out.println("proses data : [" + a.spop().data + "]");
                }
                if(a.empty()){
                    break;
                }
            }
            else{
                System.out.print("Proses [Y/N]: ");
                proses = input.next();
                if(proses.equalsIgnoreCase("Y")){
                    System.out.println("proses data : [" + a.qpop().data + "]");
                }
                if(a.empty()){
                    break;
                }
            }
            System.out.print("Pilih lagi ? : ");
            ulg = input.next();
        }while(ulg.equalsIgnoreCase("Y"));
    }
}
