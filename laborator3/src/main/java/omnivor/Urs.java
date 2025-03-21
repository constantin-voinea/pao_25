package omnivor;

/**
 * @author cvoinea
 */
public class Urs extends Omnivor {

    public Urs(String nume, int varsta) {
        super(nume, varsta);
        this.setTipSunet("mormaie");
        System.out.println("Apelare constructor Urs. ");
    }

    //@Override
    public void scoateSunet() {
        System.out.println("Ursul " + this.getTipSunet());
    }

    //@Override
    public String toString() {
        return super.toString() + "Urs{tipsunet="
                + this.getTipSunet() + "}";
    }
}
