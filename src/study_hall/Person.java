package study_hall;

public class Person {
    public static final String DEFAULT_FIRSTNAME = "John";
    public static final String DEFAULT_LASTNAME = "Doe";
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        if(firstName == null || lastName == null) {
            throw new IllegalArgumentException("Null is not allowed as an argument");
        }

        this.firstName = firstName;
        this.lastName = lastName;

    }


    public Person() {
        this.firstName = DEFAULT_FIRSTNAME;
        this.lastName = DEFAULT_LASTNAME;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
