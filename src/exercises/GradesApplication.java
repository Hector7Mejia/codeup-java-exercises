package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        Student jimmy = new Student("jimmy");
        Student timmy = new Student("timmy");
        Student zimmy = new Student("zimmy");

        jimmy.addGrade(10);
        jimmy.addGrade(100);
        jimmy.addGrade(50);
        jimmy.addGrade(50);
        timmy.addGrade(100);
        timmy.addGrade(100);
        timmy.addGrade(100);
        timmy.addGrade(90);
        zimmy.addGrade(50);
        zimmy.addGrade(50);
        zimmy.addGrade(50);
        zimmy.addGrade(50);

        students.put("jimmyNeutron", jimmy);
        students.put("timNeut", timmy);
        students.put("zimmyNeut", zimmy);

        System.out.println("Welcome!\nHere are the GitHub usernames of our students:");

        for (String key : students.keySet()) {
            System.out.print("|" + key + "|  ");
        }
        System.out.println();


        String userinput = "";
        do {
            System.out.println();
            System.out.println("What student would you like to see more information on?");
            userinput = sc.next();
            if (students.containsKey(userinput)) {
                Student currentStudent = students.get(userinput);
                System.out.println("Name: " + currentStudent.getName() + " - " + "GitHub Username: " + userinput);
                System.out.println("Current Average: " + currentStudent.getGradeAverage());
                System.out.println();

            } else {
                System.out.println("wrong, no student found with the GitHub username of " + userinput + ".");
                System.out.println("Would you like to see another student?");
            }

            System.out.println("Continue(y/n)");
            System.out.println();
            userinput = sc.next();
            if (userinput.equals("n")) {
                System.out.println("Goodbye, and have a wonderful day!");
            }

        } while (userinput.equals("y"));
    }
}
