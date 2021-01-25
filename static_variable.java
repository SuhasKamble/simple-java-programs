class Student {
    static int count;

    Student() {
        count++;
    }

    void student_count() {
        System.out.println("Student no. " + count);
    }
}

public class static_variable {
    public static void main(String[] args) {
        Student s = new Student();
        s.student_count();
        Student s1 = new Student();
        s1.student_count();
        Student s2 = new Student();
        s2.student_count();
        Student s3 = new Student();
        s3.student_count();
    }
}