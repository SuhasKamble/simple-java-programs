class StaticDemo {
    int a;
    static int b = 0;

    static void update() {
        b = 10;
    }

    public void display() {
        System.out.println("The value of a : " + a);
        System.out.println("The value of b : " + b);
    }
}

public class static_method {
    public static void main(String[] args) {
        // invoking static method before creating any instance
        StaticDemo.update();

        // Creating object
        StaticDemo s = new StaticDemo();
        s.display();
    }
}
