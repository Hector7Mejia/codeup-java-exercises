package study_hall;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

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
    //public Person(int initialAge) {
    //  		if(initialAge < 0){
    //            age = 0;
    //            System.out.println("Age is not valid, setting age to 0.");
    //        }else{
    //            age = initialAge;
    //        }
    //	}
    //
    //	public void amIOld() {
    //        String ans;
    //  		if(age < 13){
    //            ans = "You are young.";
    //        }else if(age >= 13 && age < 18){
    //            ans = "You are a teenager.";
    //        }else{
    //            ans = "You are old.";
    //        }
    //        System.out.println(ans);
    //	}
    //
    //	public void yearPasses() {
    //  		age += 1;
    //	}

public static void main(String[] args) {
//    ArrayList<Integer> runningMedianList = new ArrayList<>();
//    runningMedianList.add(1);
//    runningMedianList.add(10);
//    runningMedianList.add(20);
//    runningMedian(runningMedianList);
//    dnaCompliments("tamper");
//    dnaCompliments("tamper");
//    dnaConverter("GTCAG");
      findTheWord("I like cheese", "sfds fsdfsf fsdf No I like cheese");
}

public static void findTheWord(String s, String t) {

    ArrayList<String> answer = new ArrayList<String>();
    String[] test;

    String[] b;
    b = t.split(" ");
//    Stream<String> correctT = Arrays.stream(tToLoopArray);

    String[] a;
    a = s.split(" ");
//    Stream<String> correct = Arrays.stream(stringsToLoopArray);
//    correct.forEach(x -> x.equals(correctT.toString()));
//    correct.forEach(System.out::println);
    for(int i=0, j=0; i < a.length; i++) {
         if(!a[i].equals(b[j])) {
                answer.add(a[i]);
             System.out.println(answer);
            }
         else {
             j++;
         }
    }
    System.out.println(answer);

//     test = stringsToLoop.allMatch(str -> str.length() > 2);


}

//    public static String dnaConverter(String originalDna) {
//    char dnaChar;
//    String reversedDna = "";
//    String answerDna = "";
//
//    for(int i=originalDna.length()-1; i >= 0; i--) {
//        dnaChar = originalDna.charAt(i);
//        answerDna = dnaChar + answerDna;
//    }
//
//    reversedDna = answerDna.replace("A", "T");
//    reversedDna = answerDna.replace("C", "G");
//        System.out.println(answerDna);
//    return answerDna;
//    }


//public static String dnaCompliments(String originalDnaString) {
//    String test = "test", newStr ="";
//    char chr;
//
////    for(int i=0; i < originalDnaString.length(); i++) {
////        chr = originalDnaString.charAt(i);
////
////        newStr = chr + newStr;
////    }
//    for(int i=originalDnaString.length()-1; i>=0;i-- ) {
//        System.out.println(newStr);
//        chr = originalDnaString.charAt(i);
//        newStr = newStr + chr ;
//    }
//    System.out.println(newStr);
//    return newStr;
//}


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


