package arraysEx;

import java.util.Arrays;

/**
 * @author cvoinea
 */
public class Ex2 {

    public static void main(String[] args) {

        int[] arr1 = {8, 3, 2, 5, 4, 7, 1, 0};
        for (int el : arr1) {
            System.out.print(" " + el);
        }
        System.out.println();
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        //Arrays.sort
        Arrays.sort(arr2);
        System.out.println("before binary search: "+ Arrays.toString(arr2));

//      {8, 3, 2, 5, 4, 7, 1, 0};
        System.out.println(Arrays.binarySearch(arr2, 4));

    }

    private static void bubbleSort(int[] arr1) {
        // sortare ordine crescatoare - bubble sort
        for (int i = 0; i < arr1.length - 1; i++) {
            int temp;
            int counter = 0;
            boolean ordered = true;
            for (int j = 0; j < arr1.length -1 - i; j++) {
                if (arr1[j] > arr1[j+1]) {
                    ordered = false;
                    counter++;
                    temp = arr1[j+1];
                    arr1[j+1] = arr1[j];
                    arr1[j] = temp;
                }
            }
            if (ordered) {
                break;
            }
        }
    }
}
