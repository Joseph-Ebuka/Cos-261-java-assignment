public class OverloadingExample {
    public void greet() {
        System.out.println("Hello!");
    }

    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void greet(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.greet();
        obj.greet("Rafe");
        obj.greet("Rafe", 2);
    }
}
