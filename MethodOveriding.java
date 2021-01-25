class ABC {
    public void display() {
        System.out.println("This is display method from the ABC Class");
    }
}

class Demo extends ABC {
    public void display() {
        System.out.println("This is display method from the Demo Class");
    }
}

public class MethodOveriding {
    public static void main(String[] args) {
        ABC a = new ABC();
        a.display();

        Demo d = new Demo();
        d.display();
    }
}
