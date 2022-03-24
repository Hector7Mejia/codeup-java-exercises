package exercises;

public class Person {
    // instance variables should be private like String name
    public String firstName;
    public String lastName;
    private String name;

    public Person(String name) {
        this.name = name;
    }
public Person() {

}

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }
    // setter no return
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }
    // because its inside the person class you can assign rick.firstName to rick
    public static void main(String[] args) {
        Person rick = new Person();
        rick.setName("Rick Sanchez");
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        System.out.println(rick.getName());
        System.out.println(rick);
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        // prints "Hello from Rick Sanchez!"

    }


}
