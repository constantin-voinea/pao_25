package lambda.ex1;

/**
 * @author cvoinea
 *
 * moduri de implementare a comportamentului mostenit din interfata
 */
public class Main {

    public static void main(String[] args) {

        // referinta catre interfata, implementare concreta in clasa
        Instrument guitar = new Guitar();
        guitar.play();
        System.out.println("guitar object: " + guitar);

        Guitar guitar1 = new Guitar() { // implementare particulara pentru un singur obiect
            public void play() {
                System.out.println("surprise guitar");
            }
        };
        guitar1.play();
        guitar.play();

        // clasa anonima
        Instrument piano = new Instrument() { // aici incepe blocul de cod care defineste clasa anonima care implementeaza interfata Instrument
            // implementarea metodei abstracte
            @Override
            public void play() {
                System.out.println("playing piano " + this);
            }
        };
        piano.play();

        // implementare folosind expresii lambda
        Instrument i1 = () -> System.out.println("new instrument playing"); // declarare a implementarii, nu se executa nimic la acest pas
        i1.play(); // apelul afectiv al implementarii de mai sus

        Instrument i2 = () -> System.out.println("stop playing");
        i2.play();
    }
}
