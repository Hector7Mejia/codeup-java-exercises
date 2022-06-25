package study_hall;

import org.w3c.dom.Node;

import java.util.List;
import java.util.Scanner;

public class HackerRankFunctions {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int leftdiagonal = 0, rightdiagonal = 0;
        for(int i = 0, j = arr.get(0).size()-1; i < arr.get(0).size(); i++, j--){
            leftdiagonal = leftdiagonal + arr.get(i).get(i);
            rightdiagonal = rightdiagonal + arr.get(i).get(j);
        }
        return Math.abs(leftdiagonal - rightdiagonal);
    }
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
public static String isBalanced(String s) {
    // Write your code here

    int n = -1;
    while (s.length() != n) {
        n = s.length();
        s = s.replace("()", "");
        s = s.replace("[]", "");
        s = s.replace("{}", "");
    }
    if (s.length() == 0)
        return "YES";
    else
        return "NO";
}
}
