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
        // Write your code here
        int j = 0;
        String answer = "";
        String albet = "abcdefghijklmnopqrstuvwxyz";
        String lowercaseS = s.replaceAll("\\s","").toLowerCase();
        int[] al = new int[lowercaseS.length()];
        HashMap<Character,Integer> mapBet = new HashMap<>();
//        System.out.println(lowercaseS);
        for (int i = 0; i < lowercaseS.length(); i++) {
            al[i] = lowercaseS.charAt(i);
            System.out.println(al[i]);
        }
        Arrays.sort(al);
        Set<Integer> setString = new LinkedHashSet<>();
        for(int i=0;i<al.length;i++){
            setString.add(al[i]);
        }
        System.out.println(setString);
        for (int i = 0; i < setString.size(); i++) {
            if(setString.)
        }
        //if 97-122 present the whole alphabet is thur
        //make another set<> using the alphabet and then comare it to the set  called setString using contains all done

//        if(lowercaseS.length() < albet.length()) {
//            answer = "not pangram";
//            return answer;
//        }

        for (int i = 0; i < lowercaseS.length(); i++) {
            mapBet.put(lowercaseS.charAt(i), i);
//            System.out.println(i);
        }
//        System.out.println(mapBet);
//        for (int i = 0; i < lowercaseS.length(); i++) {
//            System.out.println(mapBet.containsKey(lowercaseS.charAt(i)));
//            if(!mapBet.containsKey(albet.charAt(i))) {
//                answer = "not pangram";
//                break;
//
//            }else{
                answer = "pangram";
          //  }
        return answer;
        }

public static void main(String[] args) {
    System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));;
}
        }
