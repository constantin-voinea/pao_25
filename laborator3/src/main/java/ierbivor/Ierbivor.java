package ierbivor;

import main.Animal;

/**
 * @author cvoinea
 */
public abstract class Ierbivor extends Animal {

    public Ierbivor(String nume, int varsta) {
        super(nume, varsta);
        this.setTipHrana("vegetatie");
        System.out.println("Apelare constructor Ierbivor. ");
    }

    @Override
    public void seHraneste() {
        System.out.println(this + " se hraneste cu " + this.getTipHrana());
    }

    @Override
    public String toString() {
        return super.toString() + "Ierbivor{" +
                "tipHrana=" + this.getTipHrana() + "}";
    }
}
