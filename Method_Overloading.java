// Simple Program of Method OverLoading 

class DisplayOverloading {
    public void name(String name) {
        System.out.println("Name is " + name);
    }

    public void name(String name, int age) {
        System.out.println("Name is " + name + " and age is " + age);
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println("it's Working...");
        DisplayOverloading d = new DisplayOverloading();
        d.name("Suhas");
        d.name("Suhas", 20);
    }
}
