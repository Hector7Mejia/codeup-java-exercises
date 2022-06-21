package exercises;

import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person rick = new Person("rick");
        Person bob = new Person("bob");
        Person red = new Person("red");
        Person blue = new Person("blue");

        Person[] people = {rick, bob, red};
        Person[] newPeople = addPerson(people, blue);

//        for (int i = 0; i < people.length; i += 1) {
//            System.out.println(people[i].getName());
//        }

        for (int i = 0; i < newPeople.length; i += 1) {
            System.out.println(newPeople[i].getName());
        }



//        System.out.println(Person[0]); // 1
//        System.out.println(Person[1]); // 2
//        System.out.println(Person[2]); // 0 -- default value
//        System.out.println(Person[3]); // ArrayIndexOutOfBoundsException !!!
    }

// Person[] specifies the return type of newArraySkeleton
    public static Person[] addPerson(Person[] value, Person extraPerson) {
       Person[] newArraySkeleton = Arrays.copyOf(value, value.length + 1);
       newArraySkeleton[newArraySkeleton.length -1] = extraPerson;
       return newArraySkeleton;
    }
}
