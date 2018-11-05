package modul1;

import java.util.Scanner;

public class CustomerData {
    String nama, alamat, tgl_lahir, pekerjaan;
    int gaji;
    
    CustomerData(){
        nama = null;
        alamat = null;
        tgl_lahir = null;
        pekerjaan = null;
        gaji = 0;
    }

    public void setData(String nm, String almt, String tgllahir, String kerja, int gj){
        nama = nm;
        alamat = almt;
        tgl_lahir = tgllahir;
        pekerjaan = kerja;
        gaji = gj;
    }
    
    void getData(){
            System.out.println(
                "Nama : "+nama+"\n"+
                "Alamat : "+alamat+"\n"+
                "Tanggal Lahir : "+tgl_lahir+"\n"+
                "Pekerjaan : "+pekerjaan+"\n"+
                "Gaji : Rp. "+gaji+"\n"
            );
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerData cd = new CustomerData();
        
        System.out.println("Nama : ");
        cd.nama = sc.nextLine();
        System.out.println("Alamat : ");
        cd.alamat = sc.nextLine();
        System.out.println("Tanggal Lahir : ");
        cd.tgl_lahir = sc.nextLine();
        System.out.println("Pekerjaan : ");
        cd.pekerjaan = sc.nextLine();
        System.out.println("Gaji : ");
        cd.gaji = sc.nextInt();
        
        cd.getData();
    }
}
