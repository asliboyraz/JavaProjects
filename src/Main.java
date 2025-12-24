import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection con = Baglantim.getConnection();

        System.out.println("Yeni bir takım ekle ve ekranda takımları listele.");

        try{

            Statement st2 = con.createStatement();
            st2.executeUpdate("INSERT INTO takim(adi,kurulusYili) VALUES ('AnkaSpor',2022)");
            st2.executeUpdate("UPDATE takim SET kurulusYili=2025 WHERE adi='AnkaSpor'");


            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("Select * from takim;");

        while(rs.next()){
            System.out.println(rs.getInt(1)+"-"+rs.getString(2)+"-"+rs.getInt(3));
        }


        con.close();

        }catch (Exception e){
            System.out.println("VT HATAsı");
        }

    }


}