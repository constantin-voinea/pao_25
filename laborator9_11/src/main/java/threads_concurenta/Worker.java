package threads_concurenta;

/**
 * @author cvoinea
 */
public class Worker extends Thread {

    @Override
    public void run() {
        System.out.println("Worker started");
    }
}
