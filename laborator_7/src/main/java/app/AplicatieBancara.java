package app;

import exceptii.ExceptieConturiInexistente;
import exceptii.ExceptieFonduriInsuficiente;
import exceptii.ExceptieNumarContInexistent;
import modele.Cont;
import servicii.ServiciuBancar;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static util.Constante.FISIER_CONTURI;
import static util.Constante.MSJ_DEPUNERE_SUCCES;
import static util.Constante.MSJ_EROARE_EXECUTIE;
import static util.Constante.MSJ_RETRAGERE_SUCCES;

/**
 * @author cvoinea
 */
public class AplicatieBancara {

    private static final ServiciuBancar serviciuBancar = new ServiciuBancar();

    public static void main(String[] args) {

        serviciuBancar.citesteConturiDinFisier(FISIER_CONTURI);

        Scanner sc = new Scanner(System.in);
        String optiune;

        while (true) {
            System.out.println("""
                    
                    Alege o optiune:
                        1. Creeaza cont
                        2. Returneaza cont
                        3. Depunere
                        4. Retragere
                        5. Afiseaza conturi
                        6. Salveaza conturi si paraseste aplicatia""");
            System.out.println("Optiune: ");
            optiune = sc.nextLine();
            try {
                switch (optiune) {
                    case "1": {
                        System.out.println("Furnizati nume titulat cont: ");
                        String titular = sc.nextLine();
                        Cont cont = serviciuBancar.creeazaCont(titular);
                        System.out.println("Am creat un nou cont cu urmatoarele detalii: \n" + cont);
                        break;
                    }
                    case "2": {
                        System.out.println("Introduceti numar cont: ");
                        String numarCont = sc.nextLine();
                        System.out.println(serviciuBancar.returneazaDetaliiCont(numarCont));
                        break;
                    }
                    case "3": {
                        System.out.println("Introduceti numar cont: ");
                        String cont = sc.nextLine();
                        double suma = citesteSumaCaDouble(sc);
                        serviciuBancar.depuneInCont(cont, suma);
                        System.out.printf(MSJ_DEPUNERE_SUCCES, suma, cont);
                        break;
                    }
                    case "4": {
                        System.out.println("Introduceti numar cont: ");
                        String cont = sc.nextLine();
                        System.out.println("Introduceti suma: ");
                        double suma = citesteSumaCaDouble(sc);
                        serviciuBancar.retrageDinCont(cont, suma);
                        System.out.printf(MSJ_RETRAGERE_SUCCES, suma, cont);
                        break;
                    }
                    case "5": {
                        serviciuBancar.afiseazaConturiExistente();
                        break;
                    }
                    case "6": {
                        serviciuBancar.salveazaConturiInFisier(FISIER_CONTURI);
                        System.out.println("Am salvat conturile si inchide vom parasi aplicatia!");
                        sc.close();
                        return;
                    }
                    default: {
                        System.out.println("Optiune invalida! Revizitati meniul...\n");
                    }
                }
            } catch (InputMismatchException | ExceptieNumarContInexistent | ExceptieConturiInexistente |
                     IllegalArgumentException | ExceptieFonduriInsuficiente | IOException e) {
                System.out.printf(MSJ_EROARE_EXECUTIE, e.getMessage());
            }
        }
    }

    private static double citesteSumaCaDouble(Scanner sc) {
        System.out.println("Introduceti suma double cu 2 zecimale: ");
        try {
            return Double.parseDouble(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Format invalid pentru suma!");
            return citesteSumaCaDouble(sc);
        }
    }
}


