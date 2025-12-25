public class Sporcu {
    String isim;
    int yas;
    Takim t;

    public Sporcu() {
        this.isim ="isim";
    }

    public Sporcu(String isim) {
        this.isim = isim;
    }

    public Sporcu(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public Sporcu(String isim, int yas, Takim t) {
        this.isim = isim;
        this.yas = yas;
        this.t = t;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public Takim getT() {
        return t;
    }

    public void setT(Takim t) {
        this.t = t;
    }

}
