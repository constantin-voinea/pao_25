package classesEx;


/**
 * @author cvoinea
 */
public class Dreptunghi extends Patrulater {

    private int lungime;
    private int latime;
    String name;
    int test = 500;

    public Dreptunghi() {
        System.out.println("Apel constructor dreptunghi");
        this.name = getClass().getSimpleName() + counter;
    }

    public Dreptunghi(int lungime, int latime) {
        this();
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    protected int calculeazaPerimetru() {
        return 2 * (latime + lungime);
    }

    @Override
    int calculeazaArie() {
        return lungime * latime;
    }

    @Override
    public void test3() {
        System.out.println("test3() - dreptunghi");;
    }

    @Override
    public String toString() {
        return super.toString() + " { lungime = " + lungime + ", latime = " + latime + "}";
    }

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }
}
