package carnivor;

import main.Animal;

/**
 * @author cvoinea
 */
public abstract class Carnivor extends Animal {

    public Carnivor(String nume, int varsta) {
        super(nume, varsta);
        this.setTipHrana("carne");
        System.out.println("Apelare constructor Carnivor. ");
    }

    @Override
    public void seHraneste() {
        System.out.println(this + " se hraneste cu " + this.getTipHrana());
    }

    @Override
    public String toString() {
        return super.toString() + " Carnivor{" +
                "tipHrana=" + this.getTipHrana() + "}";
    }
}
