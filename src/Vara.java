public class Vara {

    private String varuNamn;
    double pris;
    private double saldo;

    public Vara() {
    }

    public Vara(String varuNamn, double pris, double saldo) {
        this.varuNamn = varuNamn;
        this.pris = pris;
        this.saldo = saldo;
    }

    public String getVaruNamn() {
        return varuNamn;
    }

    public void setVaruNamn(String varuNamn) {
        this.varuNamn = varuNamn;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void uppdateraSaldo() {
        saldo--;


    }

}
