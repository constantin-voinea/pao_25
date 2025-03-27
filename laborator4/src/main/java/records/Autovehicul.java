package records;

import java.util.Objects;

/**
 * @author cvoinea
 */
public class Autovehicul {

    private final String model;
    private final String nrInmatriculare;
    private final Motor motor;

    public Autovehicul(String model, String nrInmatriculare, Motor motor) {
        this.model = model;
        this.nrInmatriculare = nrInmatriculare;
        this.motor = motor;
    }

    public String getModel() {
        return model;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public Motor getMotor() {
        return motor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autovehicul auto = (Autovehicul) o;
        return Objects.equals(model, auto.model)
                && Objects.equals(nrInmatriculare, auto.nrInmatriculare)
                && Objects.equals(motor, auto.motor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, nrInmatriculare, motor);
    }

    @Override
    public String toString() {
        return "Autovehicul{" +
                "model='" + model + '\'' +
                ", nrInmatriculare='" + nrInmatriculare + '\'' +
                ", motor=" + motor +
                '}';
    }
}
