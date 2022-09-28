package study_hall.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class breakingR {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int maxRecord = scores.get(1);
        int minRecord = scores.get(1);
        int counter = 0;
        int minCounter = 0;

        List<Integer> its = new ArrayList<>();

        for(int i = 1; i < scores.size() -1; i++) {
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

        breakingRecords(ik);
    }

}
