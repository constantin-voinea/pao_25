package ierbivor;

/**
 * @author cvoinea
 */
public class Cal extends Ierbivor {

    public Cal(String nume, int varsta) {
        super(nume, varsta);
        this.setTipSunet("necheaza");
        System.out.println("Apelare constructor Cal. ");
    }

    @Override
    public void scoateSunet() {
        System.out.println("Calul " + this.getTipSunet());
    }

    @Override
    public String toString() {
        return super.toString() + "Cal{" +
                "tipSunet=" + this.getTipSunet() + "}";
    }
}
