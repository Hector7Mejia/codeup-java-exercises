package study_hall;

public class Spaceship {
    //instance variables
    private String shipName;
    // protected allows destroyer to use this.hull directly as opposed to having to use setter/getter
    protected int hull, shields, armor, speed;


    //constructor
    public Spaceship(String shipName) {
        this.shipName = shipName;
        this.armor = 10;
        this.hull = 20;
        this.shields = 0;
        this.speed = 0;
    }

// function to fire at ships
    public void fireAt(Spaceship ship2) {
        if(this.getHull() <= 0) {
            System.out.println(this.getShipName() + " has already fallen");
        }

        System.out.println(this.getShipName() + " fires at " + ship2.getShipName());
        int enemyHull = ship2.getHull();
        enemyHull = enemyHull - 10;
        ship2.setHull(enemyHull);

        if(enemyHull <= 0) {
            System.out.println(ship2.getShipName() + " explodes");
        }
    }
// function used to self repair
    public void selfRepair() {
        System.out.println(this.shipName + " is repairing");
        this.hull += 10;
    }

// accessors
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getHull() {
        return hull;
    }

    public void setHull(int hull) {
        this.hull = hull;
    }

    public int getShields() {
        return shields;
    }

    public void setShields(int shields) {
        this.shields = shields;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



}