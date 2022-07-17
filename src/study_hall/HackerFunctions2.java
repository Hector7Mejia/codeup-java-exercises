package study_hall;

import java.util.HashMap;
import java.util.Scanner;

public class HackerFunctions2 {

    public static void main(String[] args) {
        Scanner bo = new Scanner(System.in);
        int in.nextInt();
        HashMap<String,Integer> phoneBook = new HashMap<>();
        int n = 5;

        for(int i=0; i < n; i++) {
            String name = in.next();
            int number = in.nextInt();

            phoneBook.put(name, number);
        }

        while(in.HasNext()) {
            String s = intNext();

            if(phoneBook.containsKey(s)) {
                System.out.printf("%s= %d  ",s,phoneBook.get(s));
            }
        }
    }

}
