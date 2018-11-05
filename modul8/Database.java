package modul8;
import java.sql.*;
import java.util.Scanner;
public class Database {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String tny = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/praktikum", "root", "");
            Statement st = conn.createStatement();
            do{
                System.out.println("1. Masukkan Data");
                System.out.println("2. Lihat Data");
                System.out.print("Pilih : ");
                int pilih = sc.nextInt();
                if(pilih == 1){
                    System.out.print("Nama : ");String nama = sc.next();
                    System.out.print("score : ");int score = sc.nextInt();
                    System.out.print("Tanggal Masuk : ");String tgl = sc.next();
                    System.out.println(tgl);
                    String insert = "INSERT INTO person (name, score, date_in) VALUES ('"+nama+"', "+score+", '"+tgl+"')";
                    st.executeUpdate(insert);
                }
                else if(pilih == 2){
                    String select = "SELECT * FROM person ORDER BY score";
                    ResultSet row = st.executeQuery(select);
                    System.out.println("id\tname\t\tscore");
                    while(row.next()){
                        int id = row.getInt("id");
                        String name = row.getString("name");
                        int score = row.getInt("score");
                        Date tgl = row.getDate("date_in");
                        System.out.println(id + "\t" + name + "\t\t" + score);
                    }
                    System.out.println("1. Ubah Data");
                    System.out.println("2. Hapus Data");
                    System.out.println("2. Filter Data");
                    System.out.println("0. Keluar");
                    System.out.print("Pilih : ");
                    int pilihop = sc.nextInt();
                    if(pilihop == 1){
                        System.out.print("Masukkan Id : ");String id = sc.next();
                        System.out.print("Nama : ");String nama = sc.next();
                        System.out.print("score : ");String score = sc.next();
                        String update = "UPDATE person SET score = "+score+", name = '"+nama+"' WHERE id = "+id;
                        st.executeUpdate(update);
                    }
                    else if(pilihop == 2){
                        System.out.print("Masukkan Id : ");String id = sc.next();
                        String delete = "DELETE FROM person WHERE id = "+id;
                        st.executeUpdate(delete);
                    }
                    else if(pilihop == 3){
                        System.out.println("1. bulanan ");
                        System.out.println("2. tahunan ");
                        System.out.print("Filter Berdasarkan : ");
                        int fl = sc.nextInt();
                        String val;
                        if(fl == 1){
                            System.out.print("Filter Berdasarkan bulan ?[1 - 12] ");val = sc.next();
                            select = "SELECT * FROM person WHERE MONTH(date_in) = '"+val+"'";
                        }
                        else if(fl == 2){
                            System.out.print("Filter Berdasarkan tahun ? ");val = sc.next();
                            select = "SELECT * FROM person WHERE YEAR(date_in) = '"+val+"'";
                        }
                        else{
                            select = "SELECT * FROM person ORDER BY score";
                        }
                        row = st.executeQuery(select);
                        System.out.println("id\tname\t\tscore");
                        while(row.next()){
                            int id = row.getInt("id");
                            String name = row.getString("name");
                            int score = row.getInt("score");
                            Date tgl = row.getDate("date_in");
                            System.out.println(id + "\t" + name + "\t\t" + score);
                        }
                    }
                    else{
                        
                    }
                }
                System.out.println("Ingin Mengulang ? ");
                tny = sc.next();
            }while(tny.equalsIgnoreCase("Y"));            
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("failed");
        }
    }
}
