package study_hall.HackerRank;

import java.util.*;

public class checkIfIsHacker {
private static String checkIfHacker(String s) {

    String str = "hackerrank";
    if (s.length() < str.length()) {
        return "NO";
    }
    int j = 0;
    for (int i = 0; i < s.length(); i++) {
        if (j < str.length() && s.charAt(i) == str.charAt(j)) {
            j++;
        }
    }
    return (j == str.length() ? "YES" : "NO");
}

    public static String pangrams(String s) {
        String answer = "";
        String lowercaseS = s.replaceAll("\\s","").toLowerCase();
        int[] al = new int[lowercaseS.length()];
//        HashMap<Character,Integer> mapBet = new HashMap<>();
//        System.out.println(lowercaseS);
        for (int i = 0; i < lowercaseS.length(); i++) {
            al[i] = lowercaseS.charAt(i);
        }
        Arrays.sort(al);
        Set<Integer> setString = new LinkedHashSet<>();
        for(int i=0;i<al.length;i++){
            setString.add(al[i]);
        }
        System.out.println(setString);
        if(setString.size() == 26) {
            answer = "pangram";
        } else {
            answer = "not pangram";
        }
        return answer;
        }

public static void main(String[] args) {
    System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));;
}
        }
