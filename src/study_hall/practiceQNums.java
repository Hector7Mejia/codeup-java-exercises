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
    int mostFrequentInt = 0;

    for(int i = intArray.length -1; i >= 0; i--){
        int temp = intArray[i];
        while(temp>0){
            test2.add(0, temp%10);  //place low order digit in array
            temp = temp /10;        //remove low order digit from temp;
        }
    }

    System.out.println(getPopularElement(test2));


//    for(int j=0; j < test2.size();j++) {
//        while(test2.get(j) == test2.get(j+1)) {
//            mostFrequentInt ++;
//        }
//        System.out.println(mostFrequentInt);
//    }

}

    public static int getPopularElement(ArrayList<Integer> a)
    {
        //    For a = [25, 2, 3, 57, 38, 41], the output should be solution(a) = [2, 3, 5].
        int count = 1, tempCount;
        int popular = a.get(0);
        int temp = 0;
        for (int i = 0; i < (a.size() - 1); i++)
        {
            temp = a.get(i);
            tempCount = 0;
            for (int j = 1; j < a.size(); j++)
            {
                if (temp == a.get(j))
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
            if (tempCount == count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }

public static void main(String[] args) {
    int[] a = {25, 2, 3, 57, 38, 41};
    frequentInts(a);
//    System.out.println(getPopularElement(a));
}
}
