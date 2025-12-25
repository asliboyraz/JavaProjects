public class Uygulama {
    public static void main(String[] args) {

        Sporcu_Verileri islem = new Sporcu_Verileri();
      //  s.veriAl();
        for(Sporcu s:islem.veriCek()){
         System.out.println(s.getIsim()+"-"+s.getYas());
        }

    }
}
