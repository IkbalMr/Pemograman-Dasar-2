package modul2;

import java.util.*;

public class contohArraylist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Rafi");
        al.add("Pratama");
        al.add("Adji");
        al.add("Ahmad");
        al.add("Aldy");
        
        al.remove(3);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
