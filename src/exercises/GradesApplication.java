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

        do {
            System.out.println("Welcome!\nHere are the GitHub usernames of our students:");

            for (String key : students.keySet()) {
                System.out.print("|" + key + "|  ");
            }

            System.out.println("What student would you like to see more information on?");
            String userinput = sc.next();
            if (students.containsKey(userinput)) {
                Student currentStudent = students.get(userinput);
                System.out.println(currentStudent.getGradeAverage());
                System.out.println(currentStudent.getName());
            } else {
                System.out.println("wrong try again");
                System.out.println("Would you like to see another student?");
            } else if(userinput.contains("y")) {

            }

        } while (true);
    }
}
