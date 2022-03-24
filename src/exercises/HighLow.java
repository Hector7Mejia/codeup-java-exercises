package exercises;

import util.Input;

import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        getInteger();
    }

    private static int promptForValidIntegerInRange(String prompt, int low, int high) {
        int result = 0;
Scanner input = new Scanner(System.in);
        do {
            System.out.printf("%s", prompt);
            if(!input.hasNextInt()) {
                input.nextLine();
                continue;
            }
            result = input.nextInt();
            // get rid of newline
            input.nextLine();
            if(result >= low && result <= high) {
                break;
            }
        } while(true);

        return result;
    }
    private static int rollADie(int numSides) {
        return (int) (Math.random() * numSides + 1);
    }
    public static void getInteger() {
        int answer = rollADie(100);


        while(true) {
            int guess = promptForValidIntegerInRange("Enter your guess from 1 to 100: ",
                    1, 100);
            if(guess == answer) {
                System.out.println("GOOD GUESS!");
                break;
            }
            if(guess > answer) {
                System.out.println("LOWER");
            } else {
                System.out.println("HIGHER");
            }
        }
    }
    }
