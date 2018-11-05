package modul2;

import java.util.*;

public class contohHashtable {
    public static void main(String[] args) {
        Hashtable<String, String> urutan = new Hashtable<String, String>();
        urutan.put("A1", "Nasi Goreng");
        urutan.put("A2", "Tempe Goreng");
        urutan.put("A3", "Es Teh");
        urutan.put("A4", "Es Teler");
        
        System.out.println(urutan);
        System.out.println("Menu A2 : " + urutan.get("A2"));
        System.out.println("Menu kosong : " + urutan.isEmpty());
        urutan.remove("A1");
        urutan.remove("A3");
        System.out.println(urutan);
        System.out.println("Jumlah Menu : " + urutan.size());
    }
}
