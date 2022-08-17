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
        int nextDoIt;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            d.put(alphabet.charAt(i),i +1);
        }

        System.out.println(doit);
        for (int i = 0; i < f.length(); i++) {
            doit = d.get(f.charAt(i));
            nextDoIt = d.get(f.charAt(i));
            if(doit == nextDoIt) {

            }
            System.out.println(doit);
        }

    }

    public static void main(String[] args) {
//        List<Integer> ban = new ArrayList<>();
//        doe("aaabbbbcccddd", ban);

        hashS("abc");
    }
}
