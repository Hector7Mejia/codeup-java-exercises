package study_hall;

import java.util.ArrayList;

public class practiceQNums {

//    Given an array of integers a, your task is to calculate the digits that occur the most number of times in the array. Return the array of these digits in ascending order.
//
//    Example
//
//    For a = [25, 2, 3, 57, 38, 41], the output should be solution(a) = [2, 3, 5].

public static void frequentInts(int[] intArray) {

    ArrayList<Integer> test2 = new ArrayList<Integer>();


    for(int i = intArray.length -1; i >= 0; i--){
        int temp = intArray[i];
        while(temp>0){
            test2.add(0, temp%10);  //place low order digit in array
            temp = temp /10;        //remove low order digit from temp;
        }
    }
    System.out.println(test2);

}



public static void main(String[] args) {
    int[] a = {25, 2, 3, 57, 38, 41};
    frequentInts(a);
}
}
