package threads_concurenta;

/**
 * @author cvoinea
 * * un thread este definit la nivelul sistemului de operare si consta intr-un set de instructiuni de executat
 * * JVM-ul lucreaza cu thread-uri precum garbage collector-ul, just-in-time compiler-ul etc
 * * Thread schduler - responsabil de partajarea/alocarea CPU
 * * <p>
 * * motive pentru a intrerupe/bloca un thread (de catre scheduler):
 * * - CPU-ul trebuie impartit egal intre thread-uri
 * * - un thread poate astepta ca niste date necesare sa devina disponibile
 * * un thread poate astepta ca un alt thread sa incheie o actiune de care depinde
 * * <p>
 * * Incepand cu Java v.21 avem Virtual Threads
 */
public class TestThreads {

    public static void main(String[] args) {

        // crearea unui obiect direct din clasa java.lang.Thread
        Thread t1 = new Thread();
        // din moment ce nu ii specificam un set de instructiuni de executat, thread-ul se va opri imediat dupa pornire
        t1.start();

        // creare thread prin extinderea clasei java.lang.Thread
        Thread worker1 = new Worker();
        // acest apel revine imediat la thread-ul current (main) imediat ce thread-ul custom (Worker) este pornit.
        // Nu asteapta ca metoda lui run() sa se incheie
        worker1.start();

        // creare thread prin intermediul unei clase anonime
        Thread t2 = new Thread("t3 thread") {
            @Override
            public void run() {
                System.out.println("anonymous subclass for: " + this.getName());
            }
        };
        t2.start();

        // creare thread prin implementarea interfetei Runnable
        MyRunnable r1 = new MyRunnable();
        Thread t3 = new Thread(r1);
        t3.start();

        //acelasi exemplu, dar folosind o implementare in clasa anonima
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous class implementing Runnable ");
            }
        };
        Thread t4 = new Thread(r2);
        t4.start();

        // folosind expresii lambda: Runnable este interfata functionala
        Runnable r3 = () -> System.out.println("my runnable r3");
        Thread t5 = new Thread(r3);
        t5.start();

        // acelasi tip de exemplu, sintaxa mai concisa
        new Thread(() -> System.out.println("runnable for t4"), "t4").start();

        // nu apelam run() in loc de start() -> in acest caz, run() nu este excutat pe noul thread creat, ci in main
        Thread t6 = new Thread(() -> System.out.println("actually running on thread: " + Thread.currentThread().getName()));
        t6.run();
    }
}
