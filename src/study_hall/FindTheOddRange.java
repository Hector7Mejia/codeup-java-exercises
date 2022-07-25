package study_hall;

import java.util.ArrayList;
import java.util.List;

public class FindTheOddRange {

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        ArrayList<Integer> answer = new ArrayList<>();

        if (l % 2 == 0) {
            l = l + 1;
        }
        while (l <= r) {
            answer.add(l);
            l = l + 2;
        }
        // for (Integer integer : answer) {
        // System.out.println(integer.toString());
        // }
        return answer;

    }
}
