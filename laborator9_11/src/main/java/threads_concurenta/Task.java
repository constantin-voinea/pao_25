package threads_concurenta;

import serializare.Student;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author cvoinea
 */
public class Task implements Runnable {

    private final List<Student> studenti;
    private final Predicate<Student> filtru;

    public Task(List<Student> studenti, Predicate<Student> filtru) {
        this.studenti = studenti;
        this.filtru = filtru;
    }

    @Override
    public void run() {
        String numeThread = Thread.currentThread().getName();
        System.out.println("\nLista initiala: \n" + studenti);
        List<Student> rezultat = studenti
                .stream()
                .filter(filtru)
                //.sorted((Student s1, Student s2) -> s1.getNume().compareTo(s2.getNume()))
                .sorted(Comparator.comparing(Student::getNume))
                .toList();
        System.out.println("\nThread: " + numeThread
                + "\nfiltru: " + filtru
                + "\nrezultat: " + rezultat);
    }
}
