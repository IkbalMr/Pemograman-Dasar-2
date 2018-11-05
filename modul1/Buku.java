package modul1;

public class Buku {
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    
    Buku(String judul){
        judulBuku = judul;
    }
    void setPengarang(String pengarang){
        namaPengarang = pengarang;
    }
    void setTerbit(int terbit){
        tahunTerbit = terbit;
    }
    void setCetakan(int cetakan){
        cetakanKe = cetakan;
    }
    
    void getData(){
        System.out.println(
                "Nama Pengarang : "+namaPengarang+"\n"+
                "Judul : "+judulBuku+"\n"+
                "Tahun Tebit : "+tahunTerbit+"\n"+
                "Cetakan Ke : "+cetakanKe+"\n"
            );
    }
    
    public static void main(String[] args) {
        Buku bk1, bk2, bk3, bk4, bk5, bk6, bk7, bk8, bk9, bk10;
        bk1 = new Buku("Modul PD 2");
        bk1.setPengarang("Caulina");
        bk1.setTerbit(2016);
        bk1.setCetakan(3);
        bk1.getData();
        System.out.println();
        
        bk2 = new Buku("Modul PD 3");
        bk2.setPengarang("Hendra");
        bk2.setTerbit(2016);
        bk2.setCetakan(4);
        bk2.getData();
        System.out.println();
        
        bk3 = new Buku("Modul PD 4");
        bk3.setPengarang("Koko");
        bk3.setTerbit(2016);
        bk3.setCetakan(5);
        bk3.getData();
        System.out.println();
        
        bk4 = new Buku("Modul PD 5");
        bk4.setPengarang("Johan");
        bk4.setTerbit(2016);
        bk4.setCetakan(1);
        bk4.getData();
        System.out.println();
        
        bk5 = new Buku("Modul PD 6");
        bk5.setPengarang("Go");
        bk5.setTerbit(2016);
        bk5.setCetakan(2);
        bk5.getData();
        System.out.println();
        
        bk6 = new Buku("Modul PD 7");
        bk6.setPengarang("Caulina");
        bk6.setTerbit(2016);
        bk6.setCetakan(3);
        bk6.getData();
        System.out.println();
        
        bk7 = new Buku("Modul PD 8");
        bk7.setPengarang("Go");
        bk7.setTerbit(2016);
        bk7.setCetakan(4);
        bk7.getData();
        System.out.println();
        
        bk8 = new Buku("Modul PD 9");
        bk8.setPengarang("Johan");
        bk8.setTerbit(2016);
        bk8.setCetakan(5);
        bk8.getData();
        System.out.println();
        
        bk9 = new Buku("Modul PBO 1");
        bk9.setPengarang("Koko");
        bk9.setTerbit(2016);
        bk9.setCetakan(6);
        bk9.getData();
        System.out.println();
        
        bk10 = new Buku("Modul PBO 2");
        bk10.setPengarang("Caulina");
        bk10.setTerbit(2016);
        bk10.setCetakan(2);
        bk10.getData();
    }
}
