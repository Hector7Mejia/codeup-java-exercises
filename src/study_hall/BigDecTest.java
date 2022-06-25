package study_hall;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BigDecTest {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double negativeIndex = 0;
        double positiveIndex = 0;
        double zeroIndex = 0;

        for (Integer nums : arr) {
            if(nums < 0) {
                negativeIndex ++;
            }
            else if(nums > 0) {
                positiveIndex ++;
            }
            else if(nums == 0) {
                zeroIndex ++;
            }
        }
        System.out.println(
                BigDecimal.valueOf(positiveIndex).divide(BigDecimal.valueOf(arr.size()),6,RoundingMode.HALF_UP));

        System.out.println(
                BigDecimal.valueOf(negativeIndex).divide(BigDecimal.valueOf(arr.size()),6,RoundingMode.HALF_UP));

        System.out.println(
                BigDecimal.valueOf(zeroIndex).divide(BigDecimal.valueOf(arr.size()), 6,RoundingMode.HALF_UP));
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        // long[] longArray = Arrays.stream(arr).asLongStream().toArray();
        long max = 0, min = 0;
        Collections.sort(arr);

        for(int i = 0, j = arr.size()-1; i < arr.size()-1; i++, j--){
            min += arr.get(i);
            max += arr.get(j);
        }

        System.out.print(min + " " + max);

    }

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>(Arrays.asList(1,1,0,-1,-1));
        plusMinus(test);
    }
}



//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
////        Result.plusMinus(arr);
//
//        bufferedReader.close();
//    }
//}

