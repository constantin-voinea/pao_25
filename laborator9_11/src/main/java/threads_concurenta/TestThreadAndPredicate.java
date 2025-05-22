package threads_concurenta;

import serializare.Adresa;
import serializare.Student;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cvoinea
 */
public class TestThreadAndPredicate {

    public static void main(String[] args) {

        List<Student> studenti = List.of(
                new Student("Teo", 20, 231, new Adresa("Calarasilor", 22)),
                new Student("Adrian", 21, 321, new Adresa("Carol", 33)),
                new Student("Mihai", 20, 231, new Adresa("Unirii", 123)),
                new Student("Alex", 24, 422, new Adresa("Alexandriei", 1234)),
                new Student("Andrei", 19, 123, new Adresa("Maniu", 55))
        );

        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new Task(studenti, (Student student) -> student.getVarsta() > 20));
        pool.submit(new Task(studenti, (Student student) -> student.getNume().length() <= 4));
        pool.shutdown();

    }
}
