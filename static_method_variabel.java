class Student {
    int a;
    static int b;

    Student() {
        b++;
    }

    public void showData() {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

    }

}

public class static_method_variabel {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.showData();

        Student s2 = new Student();
        s2.showData();
        Student s3 = new Student();
        s3.showData();
        Student s4 = new Student();
        s4.showData();
        Student s5 = new Student();
        s5.showData();

    }
}
