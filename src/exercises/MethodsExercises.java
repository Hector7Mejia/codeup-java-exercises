package exercises;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(5,5));
//        System.out.println(subtraction(5,5));
        System.out.println(getInteger(5,7));

        String answer="";
        do
        {
            Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer from 1 to 10.");
        long userResponse = Long.parseLong(sc.nextLine().trim());



                int i,fact=1;
//                long number= userResponse;//It is the number to calculate factorial
                for(i=1;i<=userResponse;i++){
                    fact=fact*i;
                }
                System.out.println("Factorial of "+ userResponse +" is: "+ fact);
        System.out.println("Continue(y/n)");
            answer=sc.next();

        }while(answer.equals("y"));


    }
    public static int addition(int x, int y){
        return x + y;
    }

    public static int subtraction(int x, int y){
        return x - y;
    }

    public static int multiplication(int x, int y){
        return x * y;
    }
    public static int multiplyByAdd(int x, int y) {
        int sum = 0;
        for (int i = 1; i <= y; i++) {
            sum += x;
        }
        return sum;
    }

    public static int division(int x, int y){
        if (y == 0 || x == 0) {
            System.out.println("Can't divide by zero");
        }
        return x / y;
    }
    public static int mod(int x, int y){
        return x % y;
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max);
        int userInput = sc.nextInt();

//        how to proceed
        if (userInput < min || userInput > max) {
            System.out.println("Number is outside of range");
            return getInteger(min, max);
        } else {
//            how to stop
            System.out.println("number is within range");
            return userInput;
        }
    }




}







