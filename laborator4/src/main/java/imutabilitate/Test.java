package imutabilitate;

/**
 * @author cvoinea
 */
public class Test {

    public static void main(String[] args) {

        Adresa adresaDomiciliu = new Adresa("I. Maniu", 55);
        Persoana p1 = new Persoana("Andrei", adresaDomiciliu);
        System.out.println(p1);

        /*
        incercare alterare valoare camp nume din obiectul p1
        String este o clasa imutabila, deci valoarea membrului obiectului p1 nu se va modifica
         */
        System.out.println(p1.getNume().toUpperCase());
        System.out.println(p1);

        /*
        incercare alterare valoare membru (clasa mutabila) prin modificarea valorilor
        instantei date ca parametru la instantiere clasei imutabile
         */
        String stradaUppercase = adresaDomiciliu.getStrada().toUpperCase();
        adresaDomiciliu.setStrada(stradaUppercase);
        System.out.println(p1);

        // incercare alterare continut prin intermediul get-erului
        Adresa adresaAlt = p1.getAdresa();
        adresaAlt.setStrada("Uverturii");
        System.out.println(p1);

    }
}
