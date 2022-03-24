package study_hall;

import exercises.Person;

import java.util.ArrayList;

public class Rocks {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Person> opposingPeople = new ArrayList<>();
        Person fakeHuman = new Person();
        Person human = new Person();
        fakeHuman.setName("bobbyClone");
        human.setName("bobby");
        people.add(fakeHuman);
        people.add(human);
        System.out.println(people);
        System.out.println(opposingPeople);

        people.remove(fakeHuman);
        opposingPeople.add(fakeHuman);

        System.out.println(people);
        System.out.println(opposingPeople);

    }
}
