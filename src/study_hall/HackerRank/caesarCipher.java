package study_hall.HackerRank;

import java.util.HashMap;

public class caesarCipher {

    public static String caesar(String s, int k) {
        // Write your code here
        HashMap<String, Integer> alphab = new HashMap<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] al = alphabet.split("");
        for (int i = 0; i < al.length; i++) {
            alphab.put(al[i], i);
        }
        return s;


    }
    public static void main(String[] args){

        caesar("middle-Outz",11);
    }
}