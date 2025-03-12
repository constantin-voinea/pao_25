package classesEx;

/**
 * @author cvoinea
 */
public abstract class Patrulater {

    static int counter;
    String name;
    int test = 100;

    public Patrulater() {
        System.out.println("Apel constructor Patrulater");
        counter++;
        name = this.getClass().getSimpleName() + counter;
    }

    protected abstract int calculeazaPerimetru();
    abstract int calculeazaArie();

    //private abstract String test1(); --> combinatie invalida private + abstract
    private void test2() {
        System.out.println("test2()");
    }

    public void test3() {
        System.out.println("test3()");
    }

    @Override
    public String toString() {
        return name;
    }
}
