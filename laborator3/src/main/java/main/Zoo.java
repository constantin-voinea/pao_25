package main;

/**
 * @author cvoinea
 */
public class Zoo {

    private final int capacitateMaxima;
    private Animal[] animaleZoo;
    private int indexCurent;

    public Zoo(int capacitateMaxima) {
        if (capacitateMaxima > 0) {
            this.capacitateMaxima = capacitateMaxima;
            this.animaleZoo = new Animal[capacitateMaxima];
        } else {
            throw new RuntimeException("Nu ati introdus un numar intreg pozitiv");
        }
    }

    public void adaugaAnimalNouLaZoo(Animal animal) {
        if (indexCurent < capacitateMaxima) {
            animaleZoo[indexCurent] = animal;
            System.out.println("Am adaugat un nou animal la ZOO -->  " + animal.getClass().getSimpleName() +
                    ", numarul curent este: " + (++indexCurent));
        } else {
            throw new RuntimeException("Capacitate maxima atinsa!");
        }
    }

    public int getCapacitateMaxima() {
        return capacitateMaxima;
    }

    public Animal[] getAnimaleZoo() {
        return animaleZoo;
    }

    public int getIndexCurent() {
        return indexCurent;
    }
}
