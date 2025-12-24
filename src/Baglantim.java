import java.sql.Connection;
import java.sql.DriverManager;

public class Baglantim {
    public static final String URL = "jdbc:mysql://localhost:3306/superlig";
    public static final String userName = "root";
    public static final String sifre = "";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = (Connection) DriverManager.getConnection(URL, userName, sifre);
            System.out.println("Bağlantı başarılı");

        } catch (Exception e) {
            System.out.println("Bağlantı Hatası");
        }
        return con;
    }
}
