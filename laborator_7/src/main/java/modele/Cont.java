package modele;

import exceptii.ExceptieFonduriInsuficiente;

import java.util.UUID;

/**
 * @author cvoinea
 */
public class Cont {

    private final String nrCont;
    private final String titular;
    private double sold;

    public Cont(String titular) {
        this.nrCont = UUID.randomUUID().toString();
        this.titular = titular;
        this.sold = 0;
    }

    public Cont(String nrCont, String titular) {
        this.nrCont = nrCont;
        this.titular = titular;
        this.sold = 0;
    }

    public void depune(double suma) {
        if (suma <= 0) {
            throw new IllegalArgumentException("Suma depusa trebuie sa fie >= 0");
        }
        sold += suma;
    }

    public void retrage(double suma) throws ExceptieFonduriInsuficiente {
        if (suma > sold) {
            throw new ExceptieFonduriInsuficiente("Fonduri insuficiente, suma retrasa este prea mare!");
        }
        sold -= suma;
    }

    @Override
    public String toString() {
        return nrCont + "," + titular + "," + sold;
    }

    public static Cont parsareCont(String linie) {
        String[] elementeCont = linie.split(",");
        Cont cont = new Cont(elementeCont[0], elementeCont[1]);
        cont.sold = Double.parseDouble(elementeCont[2]);
        return cont;
    }

    public String getNrCont() {
        return nrCont;
    }

    public String getTitular() {
        return titular;
    }

    public double getSold() {
        return sold;
    }
}
