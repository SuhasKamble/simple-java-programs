class AreaOfShapes {
    void area(float x) {
        System.out.println("The area of sqaure is " + Math.pow(x, 2) + " sq units");
    }

    void area(float z, float y) {
        System.out.println("The are of rectangle is " + (z * y) + " sq units");
    }

    void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("The area of the circle is " + z + " sq units");
    }
}

public class Method_OverloadDemo {
    public static void main(String[] args) {
        AreaOfShapes a = new AreaOfShapes();
        a.area(34);
        a.area(1, 1);
        a.area(10.0);
    }
}
