package study_hall;

public class SpaceshipTest {
    public static void main(String[] args) {
        // ship1 is just pointing to the object
        Spaceship ship1 = new Spaceship("Death");
        Spaceship ship2 = new Destroyer("Lambchop");


        ship1.fireAt(ship2);
        ship2.selfRepair();
        ship1.fireAt(ship2);
        ship2.fireAt(ship1);
        ship1.fireAt(ship2);
        ship2.fireAt(ship1);
    }
}
