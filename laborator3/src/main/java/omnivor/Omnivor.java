package omnivor;

import main.Animal;

/**
 * @author cvoinea
 */
public abstract class Omnivor extends Animal {

    public Omnivor(String nume, int varsta) {
        super(nume, varsta);
        this.setTipHrana("carne si vegetatie");
        System.out.println("Apelare constructor Omnivor. ");
    }

    @Override
    public void seHraneste() {
        System.out.println(this + " se hraneste cu " + this.getTipHrana());
    }

    @Override
    public String toString() {
        return super.toString() + "Omnivor{" +
                "tipHrana=" + this.getTipHrana() + "}";
    }
}
