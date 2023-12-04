public class Kund {

    private double antalVaror;
    private double totalSumma;

    public double getAntalVaror() {
        return antalVaror;
    }

    public void setAntalVaror(int antalVaror) {
        this.antalVaror = antalVaror;
    }

    public double getTotalSumma() {
        return totalSumma;
    }

    public void setTotalSumma(double totalSumma) {
        this.totalSumma = totalSumma;

    }
    public void adderaVara(double pris) {
        antalVaror++;
        totalSumma = (pris + totalSumma);

    }
}

