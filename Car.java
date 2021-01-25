
class Engine {
    double price_engine;
    String type_engine;

    public void engine_date(double price_engine, String type_engine) {
        this.price_engine = price_engine;
        this.type_engine = type_engine;

    }

    public void display_engine() {
        System.out.println("Price of Engine: " + this.price_engine);
        System.out.println("Type of Engine: " + this.type_engine);
    }

}

class Tyre extends Engine {
    double price_of_tyre;
    String type_of_tyre;

    public void tyre_data(double price_tyre, String type_tyre) {
        this.price_of_tyre = price_tyre;
        this.type_of_tyre = type_tyre;
    }

    public void disply_tyre() {
        System.out.println("Price of Tyre: " + this.price_of_tyre);
        System.out.println("Type of Tyre: " + this.type_of_tyre);
    }
}

class Door extends Tyre {
    int size_of_door;
    String color_of_door;

    public void door_data(int size_of_door, String color_of_door) {
        this.size_of_door = size_of_door;
        this.color_of_door = color_of_door;
    }

    public void display_door() {
        System.out.println("Size of Door: " + this.size_of_door);
        System.out.println("Color of Door: " + this.color_of_door);
    }

}

public class Car extends Door {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.engine_date(123400.00, "snapDragin");
        System.out.println("Engine***********");
        c1.display_engine();

        c1.tyre_data(124.00, "RoadWay");
        System.out.println("Tyre***********");
        c1.disply_tyre();

        c1.door_data(10, "red");
        System.out.println("Door***********");
        c1.display_door();

    }
}
