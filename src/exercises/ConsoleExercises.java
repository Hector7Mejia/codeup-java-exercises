package exercises;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = input.next();
        System.out.println("You entered: --> \"" + userInput + "\" <--");
        input.close();
    }
}
