package comparare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author cvoinea
 */
public class Test {

    public static void main(String[] args) {
        Autovehicul[] autovehicule = {
                new Autovehicul("Ford", 2010, 123.44),
                new Autovehicul("Mazda", 2014, 222.33),
                new Autovehicul("Dacia", 2015, 55.50),
                new Autovehicul("BMW", 2020, 300.14),
                new Autovehicul("VW", 2011, 260.4),
                new Autovehicul("Ford", 2010, 125.00),
        };

        printAutovehicule("lista initiala: ", autovehicule);
        Arrays.sort(autovehicule);
        // sortare alfabetica
        printAutovehicule("sortare alfabetica", autovehicule);

        //sortare an fabricatie DSC
        Arrays.sort(autovehicule, new ComparatorAnFabricatieDescrescator());
        printAutovehicule("sortare an fabricatie DSC", autovehicule);

        //sortare pret ASC
        Arrays.sort(autovehicule, new ComparatorPretCrescator());
        printAutovehicule("sortare pret ASC", autovehicule);

        // inlantuire comparatori
        Arrays.sort(autovehicule,
                new ComparatorAnFabricatieDescrescator().reversed()
                        .thenComparing(
                                new ComparatorPretCrescator().reversed()));
        printAutovehicule("inlantuire compartori: ", autovehicule);

        // sortare alfabetica DSC, similara implementarii Comparable, dar folosind comparator anonim
        Arrays.sort(autovehicule, new Comparator<Autovehicul>() {
            @Override
            public int compare(Autovehicul o1, Autovehicul o2) {
                return o2.getMarca().compareTo(o1.getMarca());
            }
        }); //mecanism callback, furnizam implementarea singurei metode abstracte din Comparator
        printAutovehicule("sortare alfabetica DSC, similara implementarii Comparable, dar folosind comparator anonim: ",
                autovehicule);

        // aceeasi implementare, dar folosind o expresie lambda (Comparator fiind interfata functionala)
//        Arrays.sort(autovehicule, (o1, o2)
//                -> o2.getMarca().compareTo(o1.getMarca())); //mecanism callback, furnizam implementarea singurei metode abstracte din Comparator
//        printAutovehicule("sortare alfabetica DSC folosind comparator anonim -> expr lambda: ",
//                autovehicule);

    }

    private static void printAutovehicule(String mesaj, Autovehicul[] autovehicule) {
        System.out.println(mesaj + Arrays.toString(autovehicule));
    }
}
