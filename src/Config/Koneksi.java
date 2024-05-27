package Config;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Koneksi {
    private static Connection conn; // Variabel statis untuk menyimpan koneksi
    
    // Metode untuk mendapatkan koneksi ke basis data
    public static Connection getConnection(){
        if(conn==null) { // Jika koneksi belum dibuat
            try {
                String url = "jdbc:mysql://localhost:3306/db_kampus"; // URL koneksi
                String user = "root"; // Nama pengguna basis data
                String password = ""; // Kata sandi basis data
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); // Registrasi driver JDBC
                
                // Membuat koneksi ke basis data
                conn = (Connection) DriverManager.getConnection(url,user,password);
            }
            catch (Exception e) { // Menangkap eksepsi jika terjadi kesalahan
                // Mencatat eksepsi ke log dengan level SEVERE
                Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return conn; // Mengembalikan koneksi
    }
}
