package HW.Pr1;

public class Spaceship {



    public static void main(String[] args) {

        Spaceships obj = new Spaceships();
        Spaceships obj1 = new Spaceships();

        obj.name = "Valinor";
        obj1.name = "Shir";
        obj.speed = 1232;
        obj1.speed = 1000;

        obj.showSpaceShipName();
        obj.showSpaceShipSpeed();
        obj1.showSpaceShipName();
        obj1.showSpaceShipSpeed();

    }
}
