package study_hall;

import java.sql.Array;
import java.util.ArrayList;

public class MapPractice {

    int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] intArrayn = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//    int[] intArray = new int[20];

    public static void reverseString(int[] toBeReversed) {
        ArrayList<Integer> reversedArray = new ArrayList<>();

        for (int i = toBeReversed.length - 1; i >= 0; i--) {
            reversedArray.add(toBeReversed[i]);
        }
        System.out.println(reversedArray);
    }

    static void sortit(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
    }

    public static void main(String[] args) {

        int[] intArrayn = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        int[] arr = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1, 1};
        int n = arr.length;

        // for sort an array
//        sortit(arr, n);

        // for print all the
        // element in sorted way
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//        reverseString(intArrayn);
    }
}
