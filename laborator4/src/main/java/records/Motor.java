package records;

/**
 * @author cvoinea
 *
 * un record are un nume si o descriere a starii, care declara componentele acelui record
 * Optional, un record are si un body
 *
 * Pentru ca se vrea a fi un nou tip simplu, care doar sa tina date, primeste automat urmatoarele functionalitati:
 *      - cate un camp final si privat pt toate componentele din descrierea starii
 *      - cate o metoda publica de accesare a acestor componente de stare (campuri)
 *      -un constructor public cu aceeasi semnatura cu cea din descriere
 *      -implementari pentru equals si hashcode (2 records sunt egale daca au acelasi tip si aceeasi stare)
 *      -o implementare toString care cuprinde reprezentarea string a componentelor
 *      - The record's body may declare static methods, static fields, static initializers, constructors, instance methods, and nested types
 *
 *  Restrictii:
 *  - nu pot extinde alte clase
 *  - nu pot declara alte campuri decat cele definite ca stare (pote avea doar statice in plus)
 * - nu pot fi abstracte pt ca implicit sunt final
 *
 */
public record Motor(double volum, int putere) {

    static String nume = "";

    public Motor(double volum) {
        this(volum, 2000);
    }

    public double calculeazaVolumInLitri() {
        return volum() / 1000;
    }

    public static double calculeazaVolumInLitri(Motor motor) {
        return motor.volum / 1000;
    }
}
