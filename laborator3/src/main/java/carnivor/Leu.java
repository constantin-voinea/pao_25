package carnivor;

/**
 * @author cvoinea
 */
public class Leu extends Carnivor {

    public Leu(String nume, int varsta) {
        super(nume, varsta);
        this.setTipSunet("rage");
        System.out.println("Apelare constructor Leu. ");
    }

    @Override
    public void scoateSunet() {
        System.out.println("Leul " + this.getTipSunet());
    }

    @Override
    public String toString() {
        return super.toString() + "Leu{" +
                "tipSunet=" + this.getTipSunet() + "}";
    }
}
