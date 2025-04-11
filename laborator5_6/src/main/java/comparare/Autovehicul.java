package comparare;


/**
 * @author cvoinea
 */
public class Autovehicul implements Comparable<Autovehicul> {

    private String marca;
    private int anFabricatie;
    private double pret;

    public Autovehicul(String marca, int anFabricatie, double pret) {
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.pret = pret;
    }

    @Override
    public int compareTo(Autovehicul o) {
        return this.marca.compareTo(o.getMarca());
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Autovehicul{" +
                "marca='" + marca + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", pret=" + pret +
                '}';
    }
}
