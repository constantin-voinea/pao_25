package ierbivor;

/**
 * @author cvoinea
 */
public class Elefant extends Ierbivor {

    public Elefant(String nume, int varsta) {
        super(nume, varsta);
        this.setTipSunet("trambiteaza");
        System.out.println("Apelare constructor Elefant. ");
    }

    @Override
    public void scoateSunet() {
        System.out.println("Elefantul " + this.getTipSunet());
    }

    @Override
    public String toString() {
        return super.toString() + "Elefant{" +
                "tipSunet=" + this.getTipSunet() + "}";
    }
}
