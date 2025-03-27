package imutabilitate;

/**
 * @author cvoinea
 */
// clasa final - interzicere mostenire
public final class Persoana {

    // campuri private si final - initializate o sg. data si accesate doar indirect, prin get-eri
    private final String nume;
    private final Adresa adresa; // has-to-has-a

    public Persoana(String nume, Adresa adresa) {
        this.nume = nume;
        this.adresa = new Adresa(adresa);
        // supraincarcarea constructorului clasei Adresa inlocuieste implementarea urmatoare:
//        String numeStrada = adresa.getStrada();
//        String numarStrada = adresa.getNumar();
//        Adresa copieAdresa = new Adresa(numeStrada, numarStrada);
//        this.adresa = copieAdresa;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", adresa=" + adresa +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public Adresa getAdresa() {
        return new Adresa(adresa); // returnare copie adresa
    }

}
