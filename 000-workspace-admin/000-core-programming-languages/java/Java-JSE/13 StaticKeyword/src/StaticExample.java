public class StaticExample {
    private static int count; // static variable

    public StaticExample() {
        count++; // increment count each time a new instance is created
    }

    public static void displayCount() { // static method
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        StaticExample obj3 = new StaticExample();

        StaticExample.displayCount(); // calling static method
    }
}
