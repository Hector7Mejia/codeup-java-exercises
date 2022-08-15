package study_hall.HackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class weightedStrings {

    public static List<Integer> doe(String s, List<Integer> query) {



        return query;
    }

    public static void hashS(String f) {
        HashMap<Character,Integer> d = new HashMap<>();
        int doit = 0;

        for (int i = 0; i < f.length(); i++) {
            d.put(f.charAt(i),i);
//            doit += i;
        }
        doit = d.get('c');
        System.out.println(doit + 2);
//        System.out.println(doit);


    }

    public static void main(String[] args) {
        List<Integer> ban = new ArrayList<>();

//        doe("aaabbbbcccddd", ban);
        hashS("abc");
    }
}
