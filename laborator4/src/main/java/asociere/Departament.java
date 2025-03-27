package asociere;

import java.util.Arrays;

/**
 * @author cvoinea
 */
public class Departament {

    private String nume;
    // has-a --> agregare
    private Profesor[] profesori;

    public Departament(String nume, Profesor[] profesori) {
        this.nume = nume;
        this.profesori = profesori;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "nume='" + nume + '\'' +
                ", profesori=" + Arrays.toString(profesori) +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public Profesor[] getProfesori() {
        return profesori;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setProfesori(Profesor[] profesori) {
        this.profesori = profesori;
    }
}
