public class RabatteradVara extends Vara {

    private Double procentRabbat;

    public RabatteradVara(String varuNamn, double pris, double saldo, Double procentRabbat) {
        super(varuNamn, pris, saldo);
        this.procentRabbat = procentRabbat;
        this.pris = (pris - (pris*procentRabbat));
    }

    public Double getProcentRabbat() {
        return procentRabbat;
    }

    public void setProcentRabbat(Double procentRabbat) {
        this.procentRabbat = procentRabbat;
    }

    public void raknaRabbatPris() {

    }
}
