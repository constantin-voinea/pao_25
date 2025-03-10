package Ex3;

import java.util.Scanner;

/**
 * @author cvoinea
 */
public class Test1 {
    String test1 = "test1";

    // public>protected>default>private
    // byte -> Byte, short -> Short, char -> Character, int -> Integer, long ->Long
    // float -> Float, double -> Double, boolean -> Boolean
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg:");
        int i = sc.nextInt();
        System.out.println(testPar(i));
        sc.close();
    }


    private static String testPar(int n) {

        if (n % 2 == 0) {
            return "numar par";
        }
        return "numar impar";

//       return n % 2 == 0
//               ? "numar par"
//               : "numar impar";
    }

}
