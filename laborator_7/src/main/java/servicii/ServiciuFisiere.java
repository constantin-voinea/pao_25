package servicii;

import modele.Cont;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author cvoinea
 */
public class ServiciuFisiere {

    private ServiciuFisiere() {
    }

    public static void salveazaConturiInFisier(Cont[] conturi, String caleFisier) throws IOException {
//        File file = Paths.get(caleFisier).toFile();
//        if (!file.exists()) {
//            file.createNewFile();
//        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caleFisier))) {
            for (Cont cont : conturi) {
                bw.write(cont.toString());
                bw.newLine();
            }
        }
    }

    public static Cont[] citesteConturiDinFisier(String caleFisier) throws IOException {
        File fisier = new File(caleFisier);
        if (!fisier.exists()) {
            throw new FileNotFoundException("Nu exista conturi salvate in fisier!");
        }
        Cont[] conturi = new Cont[100];
        int index = -1;
        try (BufferedReader br = new BufferedReader(new FileReader(caleFisier))) {
            String linie;
            while ((linie = br.readLine()) != null) {
                conturi[++index] = Cont.parsareCont(linie);
            }
        }
        return Arrays.copyOfRange(conturi, 0, index + 1);
    }

}
