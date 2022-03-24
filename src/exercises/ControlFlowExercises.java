package exercises;

import util.Input;

import java.util.Random;
import java.util.Scanner;


public class ControlFlowExercises {
        public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.print("i is " + i);
//            i++;
//        }
//        for(int i = 5; i <= 15; i += 1) {
//
//            System.out.println(i + " ");
//        }

//        for(int i = 100; i > 0; i -= 5) {
//
//            System.out.println(i);
//        }
//    public static void main(String[] args) {

//            int i;
//            do {
//                for (i = 2; i < 102; i += 2) {
//                    System.out.println(i);
//                }
//            } while (i < 100);


//            long i = 2L;
//
//        do{
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000L);

//                for (int i = 1; i <= 30; i++) {
//                        if(i % 3 == 0 && i % 5 == 0){
//                                System.out.println("FizzBuzz");
//                        }
//                        else if(i % 5 == 0){
//                                System.out.println("Buzz");
//                        }
//                        else if(i % 3 == 0){
//                                System.out.println("Fizz");
//                        }
//                        else
//                             System.out.println(i);
//

//                }

//        System.out.println(gradeString);

            String answer="";
            Scanner sc = new Scanner(System.in);


            do {
                System.out.println("What number would you like to go up to?");
int x = sc.nextInt();
                System.out.println("Here is your table!");
                System.out.println("number " + '|' + " squared " + '|' + " cubed");
                System.out.println("------ | ------- | -----");
                for (int i = 1; i <= x; i++) {
                    System.out.format("%-6d", i);
                    System.out.print(" | ");
                    System.out.format("%-7d", i * i);
                System.out.print(" | ");
                System.out.println(i * i * i);
                }
                System.out.println("Do you want to continue? (y/n)");
                answer=sc.next();
            }while(answer.equals("y"));
//            String answer="";
//            Scanner sc = new Scanner(System.in);
//            do {
//                System.out.println("Please enter a grade from 0 - 100!");
//
//
//                int numericGrade = sc.nextInt();
//
//                if (numericGrade >= 88) {
//                    System.out.println("A");
//                } else if (numericGrade >= 80) {
//                    System.out.println("B");
//                } else if (numericGrade >= 67) {
//                    System.out.println("C");
//                } else if (numericGrade >= 60) {
//                    System.out.println("D");
//                } else {
//                    System.out.println("F");
//                }
//
//                System.out.println("Do you want enter another grade? (y/n)");
//                answer=sc.next();
//
//
//            } while (answer.equals("y"));
        }

}

