package study_hall;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HackerRankFunctions {
    ///*
    // * Complete the reverseString function
    // * Use console.log() to print to stdout.
    // */
    //function reverseString(s) {
    //    (typeof s !== 'string')
    //        ? console.log("s.split is not a function")
    //        : (s = s.split('').reverse().join(''));
    //
    //    console.log(s);
    //}
//    function regexVar(str) {
//  ^ => first item matches:
// () => stores matching value captured within
// [aeiou] => matches any of the characters in the brackets
// . => matches any character:
// + => for 1 or more occurrances (this ensures str length > 3)
// \1 => matches to previously stored match.
        // \2 looks for matched item stored 2 instances ago
        // \3 looks for matched item stored 3 ago, etc

//  $ ensures that matched item is at end of the sequence
//
//        let re = /^([aeiou]).+\1$/;
//        return re;
//    }
//    public static int diagonalDifference(List<List<Integer>> arr) {
//        // Write your code here
//        int leftdiagonal = 0, rightdiagonal = 0;
//        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
//            leftdiagonal = leftdiagonal + arr.get(i).get(i);
//            rightdiagonal = rightdiagonal + arr.get(i).get(j);
//        }
//        return Math.abs(leftdiagonal - rightdiagonal);
//    }
//
//    public static int height(Node root) {
//        // Write your code here.
//        if(root == null) {
//            return -1;
//        }
//        return Math.max(height(root.left), height(root.right)) + 1;
//    }
//
//    public static Node insert(Node root, int data) {
//        if(root == null) {
//            return new Node(data);
//        } else {
//            Node cur;
//            if(data <= root.data) {
//                cur = insert(root.left, data);
//                root.left = cur;
//            } else {
//                cur = insert(root.right, data);
//                root.right = cur;
//            }
//            return root;
//        }
//    }

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        Node root = null;
//        while(t-- > 0) {
//            int data = scan.nextInt();
//            root = insert(root, data);
//        }
//        scan.close();
//        int height = height(root);
//        System.out.println(height);
//    }
//public static String isBalanced(String s) {
//    // Write your code here
//
//    int n = -1;
//    while (s.length() != n) {
//        n = s.length();
//        s = s.replace("()", "");
//        s = s.replace("[]", "");
//        s = s.replace("{}", "");
//    }
//    if (s.length() == 0)
//        return "YES";
//    else
//        return "NO";
//}

public static void main(String[] args) {
//    ArrayList<Integer> runningMedianList = new ArrayList<>();
//    runningMedianList.add(1);
//    runningMedianList.add(10);
//    runningMedianList.add(20);
//    runningMedian(runningMedianList);
}

//public static List<Double> runningMedian(List<Integer> a) {
//    // Write your code here
//
//    ArrayList<Double> runningMedianList = new ArrayList<>();
//
//    for(int i=1; i < a.size(); i++) {
//
//        for (int j = 1; j < a.get(i); j++) {
//            System.out.println(j);
//        }
//
//    }
//
//    return runningMedianList;
//
//}

    //javascript//
    // Declare second integer, double, and String variables.
    //    var i2;
    //    var d2;
    //    var s2;
    //    // Read and save an integer, double, and String to your variables.
    //    i2 = parseInt(readLine());
    //    d2 = parseFloat(readLine());
    //    s2 = readLine();
    //    // Print the sum of both integer variables on a new line.
    //    console.log(i + i2);
    //    // Print the sum of the double variables on a new line.
    //    console.log((d + d2).toFixed(1));
    //    // Concatenate and print the String variables on a new line
    //    // The 's' variable above should be printed first.
    //    console.log(s + s2);
}
