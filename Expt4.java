interface Vehicle {
    int maxPassanger = 0;
    int maxSpeed = 0;
}

interface LandVehicle extends Vehicle {
    int numWheels = 0;

    public void drive();
}

interface SeaVehicle extends Vehicle {
    int displacement = 0;

    public void launch();
}

class Car implements LandVehicle {
    @Override
    public void drive() {
        System.out.println("This is drive method from the class Car ");
    }

    public void displayCar() {
        System.out.println("This is display method from Car Class ");
    }
}

class HoverCraft implements LandVehicle, SeaVehicle {
    @Override
    public void drive() {
        System.out.println("This is drive method from the HoverCraft Class");
    }

    @Override
    public void launch() {
        System.out.println("This is launvh method from the HoverCraft Class");
    }

    public void enterLand() {
        System.out.println("This is enterland method from HoverCraft Class");
    }

    public void entersea() {
        System.out.println("This is entersear method from the Hovercraft Class");
    }
}

class Ship implements SeaVehicle {
    @Override
    public void launch() {
        System.out.println("This is Launch method from Ship Class");
    }

    public void displayShip() {
        System.out.println("This is display method from the Ship Class");
    }
}

public class Expt4 {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.drive();
        // c1.displayCar();
        // System.out.println(c1.maxSpeed);

        // HoverCraft h1 = new HoverCraft();
        // h1.launch();
        // h1.drive();

        Ship s1 = new Ship();
        s1.launch();
        s1.displayShip();
    }
}
