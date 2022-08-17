package study_hall.HackerRank;

import java.util.ArrayList;
import java.util.List;

public class weightedUniString {
    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {
        // Write your code here
        Integer[] arr = new Integer[queries.size()];
        queries.toArray(arr);

        int c = 0;
        int[] a = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i)-96;

            if(s.charAt(i) == c) {
                a[i] = a[i] + a[i-1];
            }
            c = s.charAt(i);
        }
        // String[] d = new String[queries.size()];
        List<String> d = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            d.add("No");
            for (int j = 0; j < a.length; j++) {
                if(arr[i] == a[j]) {
                    d.remove(i);
                    d.add("Yes");
                    break;
                }
            }
        }
        return d;
    }

}

