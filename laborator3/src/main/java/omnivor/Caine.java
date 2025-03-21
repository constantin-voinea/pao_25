package omnivor;

/**
 * @author cvoinea
 */
public class Caine extends Omnivor {

    public Caine(String nume, int varsta) {
        super(nume, varsta);
        this.setTipSunet("latra");
        System.out.println("Apelare constructor Caine. ");
    }

    @Override
    public void scoateSunet() {
        System.out.println("Cainele " + this.getTipSunet());
    }

    @Override
    public String toString() {
        return super.toString() + "Caine{tipSunet=" +
                this.getTipSunet() + "}";
    }
}
