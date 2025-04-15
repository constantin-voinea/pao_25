package servicii;

import exceptii.ExceptieConturiInexistente;
import exceptii.ExceptieFonduriInsuficiente;
import exceptii.ExceptieNumarContInexistent;
import modele.Cont;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author cvoinea
 */
public class ServiciuBancar {

    private final Cont[] conturi = new Cont[100];
    private int index = -1;

    public Cont creeazaCont(String titular) {
        Cont cont = new Cont(titular);
        conturi[++index] = cont;
        return cont;
    }

    public Cont returneazaDetaliiCont(String nrCont) {
        for (int i = 0; i <= index; i++) {
            if (conturi[i].getNrCont().equalsIgnoreCase(nrCont)) {
                return conturi[i];
            }
        }
        throw new ExceptieNumarContInexistent("Nu exista un cont cu numarul specificat!");
    }

    public void depuneInCont(String nrCont, double suma) {
        Cont cont = returneazaDetaliiCont(nrCont);
        cont.depune(suma);
    }

    public void retrageDinCont(String nrCont, double suma) throws ExceptieFonduriInsuficiente {
        Cont cont = returneazaDetaliiCont(nrCont);
        cont.retrage(suma);
    }

    public void citesteConturiDinFisier(String caleFisier) {
        try {
            Cont[] conturi = ServiciuFisiere.citesteConturiDinFisier(caleFisier);
            for (Cont cont : conturi) {
                this.conturi[++index] = cont;
            }
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }

    public void afiseazaConturiExistente() {
        if (index < 0) {
            throw new ExceptieConturiInexistente("Momentan nu exista conturi bancare create!");
        }
        System.out.println(Arrays.toString(preiaDoarConturiExistente()));
    }

    public void salveazaConturiInFisier(String caleFisier) throws IOException {
        if (index < 0) {
            throw new ExceptieConturiInexistente("Momentan nu exista conturi bancare create!");
        }
        ServiciuFisiere.salveazaConturiInFisier(preiaDoarConturiExistente(), caleFisier);
    }

    private Cont[] preiaDoarConturiExistente() {
        return Arrays.copyOfRange(conturi, 0, index + 1);
    }
}
