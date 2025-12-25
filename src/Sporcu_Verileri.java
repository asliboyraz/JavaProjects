import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sporcu_Verileri implements VeriIslem{
    static Sporcu s;

    public ArrayList<Sporcu>  veriCek() {
        ArrayList<Sporcu> sporcular = new ArrayList<>();
        Sporcu s;
        try{
            Connection con = Baglantim.getConnection();
            Statement st = con.createStatement();
            ResultSet rs=st.executeQuery("Select adi,yas from sporcu;");

            while(rs.next()){
                // System.out.println(rs.getInt(1)+"-"+rs.getString(2));
                s = new Sporcu(rs.getString(1),rs.getInt(2));
                sporcular.add(s);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return sporcular;
    }


    @Override
    public void veriAl() {
        Scanner input = new Scanner(System.in);
        System.out.println("Sporcu bilgilerini giriniz.\n Sporcu ismi giriniz?");
        s.setIsim(input.nextLine());
        System.out.println("Sporcu yaşı giriniz?");
        s.setYas(input.nextInt());
    }
}
