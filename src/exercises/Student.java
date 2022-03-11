package exercises;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student jimmy = new Student("jimmy");
        Student timmy = new Student("timmy");
        Student zimmy = new Student("zimmy");
        System.out.println(jimmy.getName());
        jimmy.addGrade(10);
        jimmy.addGrade(100);
        System.out.println(jimmy.grades);
        System.out.println(jimmy.getGradeAverage());
    }


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }

//    ArrayList<Integer> grades = new ArrayList<>();

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    //     returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i += 1) {

            sum += grades.get(i);
        }
        return sum / grades.size();
    }

    ;
    //accessors

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }
}
