package carnivor;

/**
 * @author cvoinea
 */
public class Pisica extends Carnivor {

    public Pisica(String nume, int varsta) {
        super(nume, varsta);
        this.setTipSunet("miauna");
        System.out.println("Apelare constructor Pisica. ");
    }

    @Override
    public void scoateSunet() {
        System.out.println("Pisica " + this.getTipSunet());
    }

    @Override
    public String toString() {
        return super.toString() + "Pisica{" +
                "tipSunet=" + this.getTipSunet() + "}";
    }
}
