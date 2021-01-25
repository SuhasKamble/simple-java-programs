abstract class Shape {
    abstract public void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing the circle");
    }

}

class Reactange extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing the rectangle");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        Reactange r = new Reactange();
        r.draw();

    }
}
