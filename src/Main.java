import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean shop = true;
        Kund kund = new Kund();

        Vara skelett = new Vara("Skelett", 10.49, 100);
        Vara spoke = new Vara("Spöke", 5.99, 1000);
        RabatteradVara pumpa = new RabatteradVara("Pumpa", 20, 300, 0.20);

        while (shop) {
            System.out.println("Meny:");
            System.out.println("1: " + skelett.getVaruNamn() + ", " + skelett.getPris() + " SEK, " + skelett.getSaldo() + " st");
            System.out.println("2: " + spoke.getVaruNamn() + ", " + spoke.getPris() + " SEK, " + spoke.getSaldo() + " st");
            System.out.println("3: " + pumpa.getVaruNamn() + ", " + pumpa.getPris() + " SEK, " + pumpa.getSaldo() + " st");
            System.out.println("4: Betala");

            int val = scanner.nextInt();
                try {
                    if (val == 1) {
                        kund.adderaVara(skelett.pris);
                        skelett.uppdateraSaldo();
                    }
                    else if (val == 2) {
                        kund.adderaVara(spoke.pris);
                        spoke.uppdateraSaldo();
                    }
                    else if (val == 3) {
                        kund.adderaVara(pumpa.pris);
                        pumpa.uppdateraSaldo();
                    }
                    else if (val == 4) {
                        System.out.println("Du köpte: " + kund.getAntalVaror() + " varor för en total kostnad av " + kund.getTotalSumma() + " sek");
                        break;
                    } else {
                        System.out.println("Välj ett alternativ mellan 1 - 4!");
                    }
                }
                catch (java.util.InputMismatchException e) {
                    System.out.println("Felaktig inmatning. Välj ett alternativ mellan 1 - 4");
                    scanner.next();
            }
        }
        scanner.close();
    }
}