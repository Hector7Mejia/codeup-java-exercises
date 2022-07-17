package study_hall;

import java.sql.Array;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

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
//    static IntStream revRange(int from, int to) {
//        return IntStream.range(from, to)
//                .map(i -> to - i + from - 1);
//    }

//    public static void mapReverseString(int[] toBeReversed) {
//        ArrayList<Integer> answer = new ArrayList<>();
////        String[] stringss = {"a","b","c","d","e","f"};
//        List<String> listStrings = Arrays.asList(stringss);
//        LinkedList<String> linkedStrings = new LinkedList<String>(listStrings);
//        String[] Stringss = {"a", "b", "c"};
//
//
//        System.out.println(linkedStrings);
//    }

    public static void main(String[] args) {

        Integer[] intArrayn = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {10, 7, 9, 2, 8, 3, 5, 4, 6, 1, 1};
        Arrays.toString(arr);
        ArrayList<String> dnu = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            dnu.add(String.valueOf(arr[i]));
        }
        int n = arr.length;
        String[] stringss = {"a","b","c","d","e","f"};
        List<String> listStrings = Arrays.asList(stringss);
        LinkedList<String> linkedStrings = new LinkedList<>(dnu);
        String[] Stringss = {"a", "b", "c"};

        LinkedList<String> linkedList = new LinkedList<String>();

        // Append all elements of array to linked list
        // using Collections.addAll() method
//        Collections.addAll(linkedList, dnu);
        System.out.println(linkedStrings);
//        reverseString(intArrayn);
//        mapReverseString(intArrayn);

    }
}
