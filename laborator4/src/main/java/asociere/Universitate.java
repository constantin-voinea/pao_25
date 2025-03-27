package asociere;

import java.util.Arrays;

/**
 * @author cvoinea
 */
public class Universitate {

    private String nume;
    // has-to-has-a --> compozitie
    private Departament[] departamente;

    public Universitate(String nume, Departament[] departamente) {
        this.nume = nume;
        this.departamente = Arrays.copyOf(departamente, departamente.length); // copie a obiectului referentiat in parametru
    }

    @Override
    public String toString() {
        return "Universitate{" +
                "nume='" + nume + '\'' +
                ", departamente=" + Arrays.toString(departamente) +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public Departament[] getDepartamente() {
        return Arrays.copyOf(departamente, departamente.length);
    }
}
