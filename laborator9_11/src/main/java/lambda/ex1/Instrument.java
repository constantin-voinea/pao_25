package lambda.ex1;

/**
 * @author cvoinea
 *
 * interfete functionale
 */
@FunctionalInterface // aceasta adnotare garanteaza ca nu vor mai fi adaugate alte metode abstracte
public interface Instrument {

    // exact o metoda abstracta
    void play();

    default void clean(){
        System.out.println("in default method");
    }

    static void inStatic(){
        System.out.println("in static method");
    }

}
