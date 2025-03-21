package main;

import carnivor.Leu;
import carnivor.Pisica;
import ierbivor.Cal;
import ierbivor.Elefant;
import omnivor.Caine;
import omnivor.Urs;

import java.util.Scanner;

/**
 * @author cvoinea
 */
public class ZooTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul maxim de animale ce pot fi gazduite la Zoo Bucuresti: ");
        int capacitateMaxima = scanner.nextInt();
        scanner.close();

        // alternativ, putem pasa aplicatiei ca argument aceasta valoare:
        // int capacitateMaxima = Integer.parseInt(args[0]);

        Zoo zooBucuresti = new Zoo(capacitateMaxima);
        adaugaAnimaleLaZoo(zooBucuresti);

        for (int i = 0; (i < zooBucuresti.getAnimaleZoo().length) && (zooBucuresti.getAnimaleZoo()[i] != null); i++) {
            Animal animal = zooBucuresti.getAnimaleZoo()[i];
            animal.afiseazaDetalii();
//            animal.seHraneste();
//            animal.scoateSunet();
        }

        // demo folosire equals
        Pisica pisica = new Pisica("Tom", 2);
        Pisica pisica1 = new Pisica("Tom", 2);
        System.out.println(pisica == pisica1); //false
        System.out.println(pisica.equals(pisica1)); // true

    }

    public static void adaugaAnimaleLaZoo(Zoo zoo) {
        Leu leu = new Leu("Simba", 7);
        zoo.adaugaAnimalNouLaZoo(leu);
        Elefant elefant = new Elefant("Eli", 10);
        zoo.adaugaAnimalNouLaZoo(elefant);
        Urs urs = new Urs("Fram", 4);
        zoo.adaugaAnimalNouLaZoo(urs);
        Pisica pisica = new Pisica("Tom", 2);
        zoo.adaugaAnimalNouLaZoo(pisica);
        Caine caine = new Caine("Toto", 3);
        zoo.adaugaAnimalNouLaZoo(caine);
        Cal cal = new Cal("Thunder", 3);
        zoo.adaugaAnimalNouLaZoo(cal);
    }
}
