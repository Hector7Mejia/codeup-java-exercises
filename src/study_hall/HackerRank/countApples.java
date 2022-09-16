package study_hall.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class countApples {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        // Range<Integer> test = Range.between(1, 3);
        // boolean houseLoc = < 7;
        int counta = 0;
        for (int i = 0; i < apples.size(); i++) {
            int aTree =a + apples.get(i);

            if(aTree >= s && aTree <= t) {
                counta ++;
            }
        }
        System.out.println(counta);
        counta = 0;
        for (int i = 0; i < oranges.size(); i++) {
            int oTree = b + oranges.get(i);

            if(oTree >= s && oTree <= t) {
                counta ++;
            }
        }
        System.out.println(counta);
    }

    public static void main(String[] args) {
        List<Integer> d = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        d.add(2);
        a.add(-2);

        countApplesAndOranges(2,3,1,5,d,a);
    }

}
