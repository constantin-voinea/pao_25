package arraysEx;

import java.util.Arrays;

/**
 * @author cvoinea
 */
public class Ex1 {

    public static void main(String[] args) {

        // declarare, instantiere, initializare
        int [] arr1 = {1, 5, 7, 22};
        int arr2 [] = new int[8];
        arr2[0] = 33;
        arr2[4] = 5;
        System.out.println(arr2);

        System.out.println(Arrays.toString(arr2));

        // toString, deepToString
        int [][] arr3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] arr4 = new int[3][];
        arr4[0] = new int[2];
        arr4[1] = new int[3];
        arr4[2] = new int[1];
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4[1]));
        System.out.println("Deep toString: " + Arrays.deepToString(arr4));

        // fill, copyOf, clone, arrayCopy
        int[] arr5 = new int[5];
        Arrays.fill(arr5, 3);
        System.out.println("fill(): " + Arrays.toString(arr5));

        int[] arr6 = Arrays.copyOf(arr5, arr5.length);
        System.out.println("copyOf(): " +Arrays.toString(arr6));

        int[] arr55 = arr5.clone(); // mostenita din clasa Object
        System.out.println("clone(): " +  Arrays.toString(arr55));

        int[] arr555 = new int[6];
        System.arraycopy(arr5, 0, arr555, 0, arr5.length);
        System.out.println("System.arrayCopy(): " +  Arrays.toString(arr555));

        // equals vs. deepEquals
        int[][] arr7 = Arrays.copyOf(arr3, arr3.length);
        int[][] arr8 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("equals: " + Arrays.equals(arr3, arr7)); // true
        System.out.println("equals: " + Arrays.equals(arr3, arr8)); // false
        System.out.println("deepEquals: " + Arrays.deepEquals(arr3, arr7)); // true
        System.out.println("deepEquals: " + Arrays.deepEquals(arr3, arr8)); // true
    }

    // method overloading
    public static int overload1(int a, int b, double c) {
        return 1;
    }
    public static byte overload1(double a, int b, int c) {
        return 2;
    }
}
