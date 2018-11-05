package modul2;

import java.util.*;

public class Matakuliah {
    public static void main(String[] args) {
        Hashtable<String, String> urutan = new Hashtable<String, String>();
        urutan.put("mk1", "Statistika");
        urutan.put("mk2", "Pemograman Dasar 2");
        urutan.put("mk3", "Basis Data Lanjut");
        urutan.put("mk4", "Logika Informatika");
        urutan.put("mk5", "Algoritma 2");
        
//        System.out.println(urutan);
        for(int i = 1; i <= urutan.size(); i++){
            System.out.println(urutan.get("mk"+i));
        }
        System.out.println("==============================");
        System.out.println("data setelah dihapus");
        System.out.println("==============================");
        
        urutan.remove("mk1");
        for(int i = 1; i <= urutan.size(); i++){
            System.out.println(urutan.get("mk"+i));
        }
        System.out.println("Jumlah Matakuliah : " + urutan.size());
    }
}
