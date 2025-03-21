package main;

import java.util.Objects;

/**
 * @author cvoinea
 */
public abstract class Animal {

    private int nrIdentificare;
    private String nume;
    private int varsta;
    private String tipHrana;
    private String tipSunet;

//    public Animal() {}

    public Animal(String nume, int varsta) {
        System.out.println("Apelare constructor Animal. ");
        this.nume = nume;
        this.varsta = varsta;
        nrIdentificare = Objects.hash(nume, varsta);
    }

    public abstract void seHraneste();

    public abstract void scoateSunet();

    void afiseazaDetalii() {
        System.out.println("Acesta este un " + this);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal animal) {
            return animal.nrIdentificare == this.nrIdentificare;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Animal din categoria " + this.getClass().getSuperclass().getSimpleName() +
                ", din specia " + this.getClass().getSimpleName() + "{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ",nrIdentificare=" + nrIdentificare +
                '}';
    }


    public int getNrIdentificare() {
        return nrIdentificare;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getTipHrana() {
        return tipHrana;
    }

    public String getTipSunet() {
        return tipSunet;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setTipHrana(String tipHrana) {
        this.tipHrana = tipHrana;
    }

    public void setTipSunet(String tipSunet) {
        this.tipSunet = tipSunet;
    }
}
