package records;

/**
 * @author cvoinea
 */
public class Test {

    public static void main(String[] args) {

        Motor motor = new Motor(1180, 120);
        System.out.println("putere motor: " + motor.putere());
        System.out.println("volum motor: " + motor.volum());

        Autovehicul auto = new Autovehicul("Dacia", "abc", motor);
        System.out.println(auto);
    }
}
