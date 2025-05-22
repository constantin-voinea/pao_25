package serializare;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

/**
 * @author cvoinea
 */
public class TestSerializare {

    private static final String numeFisier = "student_ser";

    public static void main(String[] args) {

        Adresa adresaS1 = new Adresa("Apusului", 55);
        Student s1 = new Student("Teo", 22, 231, adresaS1);
        int[] noteS1 = {9, 10, 8, 6, 9};
        s1.setNote(noteS1);

        System.out.println("inainte de serializare: \n" + s1);
        serializareStudent(s1);

        /*
         * incercare alterare campuri:
         * campurile statice nu sunt serializate, deci noua valoare este reflectata in obiect dupa deserializare
         * campurile de instanta vor fi suprascrise la deserializare, deci vom vedea valoarea serializata
         */
        Student.setFacultate("abcde");
        LocalDateTime altMoment = LocalDateTime.now();
        System.out.println(altMoment);
        s1.setTimpCurent(altMoment);

        s1 = deserializareStudent();
        System.out.println("dupa deserializare: \n" + s1);
    }


    private static void serializareStudent(Student student) {
        try (FileOutputStream fos = new FileOutputStream(numeFisier);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e.getCause());
        }
    }

    private static Student deserializareStudent() {
        try (FileInputStream fis = new FileInputStream(numeFisier);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return (Student) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
