package study_hall.HackerRank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class breakingR {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int maxRecord = scores.get(0);
        int minRecord = scores.get(0);
        int counter = 0;
        int minCounter = 0;

        List<Integer> its = new ArrayList<>();

        for(int i = 0; i < scores.size(); i++) {
            if(maxRecord < scores.get(i)) {
                maxRecord = scores.get(i);
                counter ++;
            } else if(minRecord > scores.get(i)) {
                minRecord = scores.get(i);
                minCounter ++;
            }
        }
        its.add(counter);
        its.add(minCounter);
        return its;
    }

    public static void main(String[] args) {
        List<Integer> ik = new ArrayList<>();
         int[] low = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        List<Integer> lo = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            lo.add(low[i]);
        }
        ik.add(9);
        ik.add(10);
        ik.add(5);
        ik.add(20);
        ik.add(20);
        ik.add(4);
        ik.add(5);
        ik.add(2);
        ik.add(25);
        ik.add(1);

        System.out.println(breakingRecords(lo));
    }

}
