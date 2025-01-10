import java.time.LocalDate;

public class Zakaznik {

    private String jmeno;
    private LocalDate narozeni;
    private String mesto;
    private int pocetProdeju;

    public Zakaznik(String jmeno, LocalDate narozeni, String mesto, int pocetProdeju) {
        this.jmeno = jmeno;
        this.narozeni = narozeni;
        this.mesto = mesto;
        this.pocetProdeju = pocetProdeju;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public LocalDate getNarozeni() {
        return narozeni;
    }

    public void setNarozeni(LocalDate narozeni) {
        this.narozeni = narozeni;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public int getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(int pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }
}
