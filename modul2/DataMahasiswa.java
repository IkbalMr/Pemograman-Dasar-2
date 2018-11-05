package modul2;

import java.util.*;

public class DataMahasiswa {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Rafi\t\t"+"151111081\t\t"+"Malang");
        al.add("Aldy\t\t"+"151111049\t\t"+"Malang");
        al.add("Windy\t\t"+"151111098\t\t"+"Malang");
        al.add("Royan\t\t"+"151111073\t\t"+"Malang");
        al.add("Alpin\t\t"+"151111034\t\t"+"Malang");
        
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        System.out.println("==============================");
        System.out.println("data setelah dihapus");
        System.out.println("==============================");
        al.remove(4);
        Iterator it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
