package study_hall.HackerRank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class findMedian {

    public static long medianCalc(List<Long> arr) {
        Collections.sort(arr);
        return  arr.get(arr.size() / 2);
    }

    public static void main(String[] args) {
        List<Long> oij = new ArrayList<>();
        for (long i = 0; i < 6; i++) {
            oij.add(i);
        }
        System.out.println(medianCalc(oij));
    }
}
