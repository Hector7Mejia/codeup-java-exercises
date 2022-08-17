package study_hall.HackerRank;

import java.util.Stack;

public class reducedString {

    public static String stringReducer(String s) {
        // Write your code here
        Stack<String> myStack = new Stack<String>();

        for(String el : s.split("")) {
            // System.out.println(myStack.toString());
            if(myStack.empty()) {
                myStack.push(el);
            } else {
                if(myStack.peek().equals(el)) {
                    myStack.pop();
                } else {
                    myStack.push(el);
                }
            }
        }

        String reduced = "";
        for(Object el : myStack.toArray()) {
            reduced += String.valueOf(el);
        }

        return (reduced == "") ? "Empty String" : reduced;

    }
}
