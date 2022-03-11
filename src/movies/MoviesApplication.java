package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        Input input = new Input();

        while(true) {
            printMenu();
            int choice = input.getInt("Enter choice ");
            if (choice == 0) {
                break;
            }
            selectChoice(choice);
        }
    }

    private static void selectChoice(int choice) {
switch(choice) {
    case 1:
        break;
}
    }

    private static void printMenu() {
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category");
    }
}
