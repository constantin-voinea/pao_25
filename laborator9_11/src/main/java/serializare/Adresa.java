package serializare;

import java.io.Serializable;

/**
 * @author cvoinea
 */
public class Adresa implements Serializable {

    private String strada;
    private int numar;

    public Adresa() {
    }

    public Adresa(String strada, int numar) {
        this.strada = strada;
        this.numar = numar;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNumar() {
        return numar;
    }

    public void setNumar(int numar) {
        this.numar = numar;
    }

    @Override
    public String toString() {
        return "Adresa{" +
                "strada='" + strada + '\'' +
                ", numar=" + numar +
                '}';
    }
}
