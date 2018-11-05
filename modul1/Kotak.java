package modul1;

public class Kotak {
    double panjang;
    double lebar;
    double tinggi;
    
    Kotak(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double hitungVolume(){
        return (panjang * lebar * tinggi);
    }
    
    public static class Rotiku {
        String warna;
        String rasa;
        int berat;
        double harga;
        void beriwarna(String warnaroti){
            warna = warnaroti;
        }
        void berirasa(String rasaroti){
            rasa = rasaroti;
        }
        void timbangberat(int beratroti){
            berat = beratroti;
        }
        void hargajual(double hargaroti){
            harga = hargaroti;
        }
        void inforoti(){
            System.out.println(
                "Warna roti : "+warna+"\n"+
                "rasa roti : "+rasa+"\n"+
                "berat roti : "+berat+"\n"+
                "harga roti : Rp. "+harga+"\n"
            );
        }
    }
    
    public static class Bio {
        String Nama;
        String Alamat;
        String Nohp;
        
        Bio(String Nm){
            Nama = Nm;
        }
        void setAlamat(String lm){
            Alamat = lm;
        }
        void setNohp(String hp){
            Nohp = hp;
        }
        void infobio(){
            System.out.println(
                "Nama : "+Nama+"\n"+
                "Alamat : "+Alamat+"\n"+
                "Nohp : "+Nohp+"\n"
            );
        }
    }
    
    public static void main(String[] args) {
        Rotiku roti = new Rotiku();
        Bio b1;
        Kotak k1, k2;
        k1 = new Kotak(4,3,2);
        k2 = new Kotak(6,5,4);
        
        b1 = new Bio("Rafi");
        b1.setAlamat("Malang");
        b1.setNohp("089748392675");
        b1.infobio();
        
        System.out.println("volume k1 = "+ k1.hitungVolume());
        System.out.println("volume k2 = "+ k2.hitungVolume());
        System.out.println();
        roti.beriwarna("coklat");
        roti.berirasa("pisang coklat");
        roti.timbangberat(50);
        roti.hargajual(5000);
        roti.inforoti();
    }
}