class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " is speaking.");
    }
}

public class Teacher extends Person {
    String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }

    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Rafe", "Java");
        t.speak();
        t.teach();
    }
}
