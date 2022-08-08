package study_hall.HackerRank;

import java.util.*;

public class caesarCipher {

    public static String caesar(String s, int k) {
        // Write your code here
        HashMap<String, Integer> alphab = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] al = alphabet.split("");
        for (int i = 0; i < al.length; i++) {
            alphab.put(al[i], i);
        }
//        for (String value : alphab.keySet()) {
//            int index = 0;
//            if(value.equals(s.substring(index,index +1))) {
//                System.out.println(value);
//                index += 1;
//            }
//            // System.out.println(value);
//        }
        alphab.get(s.substring(0, 1));
//        for (String key : getKeys(alphab, 3)) {
//            System.out.println(key);
//        }
        for (int i = 0; i < s.length(); i++) {
//            if(alphab.containsKey()) {
//                for (String key : getKeys(alphab, alphab.get(s.substring(i, i + 1).toLowerCase(Locale.ROOT)))) {
////                    System.out.println(key);
////                    System.out.println(alphab.(alphab.get(key)));
//                    for (String newKey : getKeys(alphab, alphab.get(key))) {
////                        int thi = newKey + k;
//                     }
////                }
//            }
        }

        return s;


    }
    private static Set<String> getKeys(Map<String, Integer> map, Integer value) {

        Set<String> result = new HashSet<>();
        if (map.containsValue(value)) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (Objects.equals(entry.getValue(), value)) {
                    result.add(entry.getKey());
                }
                // we can't compare like this, null will throws exception
              /*(if (entry.getValue().equals(value)) {
                  result.add(entry.getKey());
              }*/
            }
        }
        return result;

    }
    public static void main(String[] args){

        caesar("middle-Outz",1);
    }
}