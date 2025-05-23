package interfete_functionale;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author cvoinea
 * Predicate<T> --> boolean test(T t)
 * BiPredicate<T, U> --> boolean test(T t, U u)
 */
public class TestPredicate {

    public static void main(String[] args) {

        // predicate
        Predicate<String> p1 = x -> x.isEmpty();
        Predicate<String> p2 = String::isEmpty; // referinta catre o metoda de instanta a unui tip arbitrar (String aici)
        System.out.println(p1.test(""));
        System.out.println(p2.test("qwerty"));

        //bi-predicate
        BiPredicate<String, String> b1 = (a, b) -> a.startsWith(b);
        BiPredicate<String, String> b2 = String::startsWith;
        System.out.println(b1.test("chicken", "chick"));
        System.out.println(b2.test("chicken", "chit"));

        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        // specificare conditii multiple
        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

        // utilizare metode default din Predicate
        Predicate<String> brownEggsDefault = egg.and(brown);
        Predicate<String> otherEggsDefault = egg.and(brown.negate());

    }
}
