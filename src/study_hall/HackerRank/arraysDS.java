package study_hall.HackerRank;

import java.util.Scanner;

public class arraysDS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
        for (int arr_i = n - 1; arr_i >= 0; arr_i--) {
            System.out.print(arr[arr_i] + " ");
        }
        in.close();
    }
}
