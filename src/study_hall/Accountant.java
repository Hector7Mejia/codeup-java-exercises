package study_hall;

public class Accountant extends Employee{
    public String work() {
        return "Hi, I manage all accounts";
    }

    // ERROR!
//    Employee tim = new Employee();
    // okay


    public static void main(String[] args) {
        Employee bob = new Accountant();
        System.out.println(bob.work());
    }
}
