package modul2;

import java.util.*;

public class bukuAlamat {
    public static void main(String[] args) {
        Hashtable<String, String> data = new Hashtable<String, String>();
        data.put("A1", "Rafi\t\t"+"Malang");
        data.put("A2", "Pratama\t\t"+"Malang");
        data.put("A3", "Adji\t\t"+"Malang");
        data.put("A4", "Arizki\t\t"+"Malang");
        data.put("A5", "Redita\t\t"+"Malang");
        data.put("A6", "Amy\t\t"+"Malang");
        data.put("A7", "Kartika\t\t"+"Malang");
        data.put("A8", "Sari\t\t"+"Malang");
        data.put("A9", "Cindy\t\t"+"Malang");
        data.put("A10", "Olivia\t\t"+"Malang");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(data.get("A"+i));
        }
        
        System.out.println("=======================");
        System.out.println("Check Ganjil");
        System.out.println("=======================");
        
        for (int i = 1; i <= 10; i++) {
            if(i%2 == 1){
                System.out.println("Data A"+i+" : "+data.containsKey("A"+i));
            }
        }
        
        data.remove("A3");
        data.remove("A4");
        System.out.println("=======================");
        System.out.println("Setelah Di Hapus");
        System.out.println("=======================");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(data.get("A"+i));
        }
        
        System.out.println("=======================");
        System.out.println("Check Ganjil");
        System.out.println("=======================");
        
        for (int i = 1; i <= 10; i++) {
            if(i%2 == 1){
                System.out.println("Data A"+i+" : "+data.containsKey("A"+i));
            }
        }
    }
}
