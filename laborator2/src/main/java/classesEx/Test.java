package classesEx;

/**
 * @author cvoinea
 */
public class Test {

    public static void main(String[] args) {

        Dreptunghi d1 = new Dreptunghi(2,4); // apelare implicita constructor clasa parinte
        System.out.println(d1);
        System.out.println("Perimetru d1: " + d1.calculeazaPerimetru());
        System.out.println("Arie d1: " + d1.calculeazaArie());
        d1.test3(); // override
        System.out.println(d1.name);
        System.out.println(d1.test); // 500


        Patrulater d2 = new Dreptunghi();
        System.out.println(d2);
        d2.test3(); // tot override
        System.out.println(d2.calculeazaPerimetru());
//        d2.test2(); --> nu este vizibila/accesibila
        System.out.println(d2.name);
        System.out.println(d2.test); // 100

    }
}
