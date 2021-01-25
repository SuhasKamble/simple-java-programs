public class static_block {
    static int rnum;
    static String name;

    static {
        rnum = 10;
        name = "Suhas Kamble";
    }

    public static void main(String[] args) {
        System.out.println("Roll number is " + rnum);
        System.out.println("Name is " + name);
    }
}
