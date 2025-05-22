package serializare;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * @author cvoinea
 */
public class Student extends Persoana implements Serializable {

    private static final long serialVersionUID = 1L;
    private static String facultate = "FMI";
    private int grupa;
    private int[] note;
    private LocalDateTime timpCurent;
    private Adresa adresa;

    public Student() {
    }

    public Student(String nume, int varsta, int grupa,
                   Adresa adresa) {
        super(nume, varsta);
        this.grupa = grupa;
        this.timpCurent = LocalDateTime.now();
        this.adresa = adresa;
    }

    public static String getFacultate() {
        return facultate;
    }

    public static void setFacultate(String facultate) {
        Student.facultate = facultate;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    public int[] getNote() {
        return note;
    }

    public void setNote(int[] note) {
        this.note = note;
    }

    public LocalDateTime getTimpCurent() {
        return timpCurent;
    }

    public void setTimpCurent(LocalDateTime timpCurent) {
        this.timpCurent = timpCurent;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }


    @Override
    public String toString() {
        return "Student{" +
                "nume='" + getNume() +
                ", varsta=" + getVarsta() +
                ", facultate=" + facultate +
                ", grupa=" + grupa +
                ", note=" + Arrays.toString(note) +
                ", adresa=" + adresa +
                ", timpCurent=" + timpCurent +
                '}';
    }
}
