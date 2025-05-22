package interfete_functionale;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author cvoinea
 * <p>
 * Consumer<T> -> void accept(T t)
 * BiConsumer<T, U> -> void accept(T t, U u)
 */
public class TestConsumer {

    public static void main(String[] args) {

        //consumer
        Consumer<String> c1 = x -> System.out.println(x);
        Consumer<String> c2 = System.out::println; // referinta catre o metoda de instanta a unui tip arbitrar
        c1.accept("John");
        c2.accept("Alex");

        //bi-consumer
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = (k, v) -> map.put(k, v);
        BiConsumer<String, Integer> b2 = map::put; // referinta catre o metoda de instanta a unui tip particular
        b2.accept("butter", 10);
        System.out.println(map);

        //bi-consumer cu 2 tipuri identice
        Map<String, String> map2 = new HashMap<>();
        BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v);
        BiConsumer<String, String> b3 = map2::put;
        b3.accept("John", "info");
        b4.accept("Dan", "math");
        System.out.println(map);
    }
}
