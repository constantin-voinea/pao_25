package asociere;

import java.util.Arrays;

/**
 * @author cvoinea
 */
public class Test {

    public static void main(String[] args) {

        Profesor profesor1Mate = new Profesor(1, "Damian");
        Profesor profesor2Mate = new Profesor(2, "Grigore");
        Profesor profesor1Info = new Profesor(3, "Andrei");
        Profesor profesor2Info = new Profesor(4, "Ion");
        Profesor profesor1MateSiInfo = new Profesor(5, "Matei");
        Profesor profesor2MateSiInfo = new Profesor(6, "Popescu");

        Profesor[] profesoriMate = new Profesor[]{profesor1Mate, profesor2Mate,
                profesor1MateSiInfo, profesor2MateSiInfo};
        Profesor[] profesoriInfo = new Profesor[] {profesor1Info, profesor2Info,
                profesor1MateSiInfo, profesor2MateSiInfo};

        Departament depInfo = new Departament("Informatica", profesoriInfo);
//        System.out.println("departament informatica: " + depInfo);
        Departament depMate = new Departament("Matematica", profesoriMate);
//        System.out.println("departament matematica: " + depMate);

        Departament[] depUnibuc = new Departament[] {depInfo, depMate};

        Universitate unibuc = new Universitate("UNIBUC", depUnibuc);
        System.out.println("Universite: " + unibuc);

        profesoriMate[0] = null;
        System.out.println("Profesori mate - modificat: " + Arrays.toString(profesoriMate));
        System.out.println("Departament matematica modificat: " + depMate);// se pierde referinta in cazul asocierii prin agregare

        depInfo = null;
        System.out.println("Univesitate dupa modificare: " + unibuc); // nu se pierde referinta in cazul asocierii prin compozitie

    }
}
