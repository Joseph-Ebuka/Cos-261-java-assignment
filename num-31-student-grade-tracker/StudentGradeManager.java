import java.util.*;

public class StudentGradeManager {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, Integer> grades = new HashMap<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Update Grade");
            System.out.println("3. View All Grades");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> updateGrade();
                case 3 -> viewGrades();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        grades.put(name, grade);
        System.out.println("Student added.");
    }

    static void updateGrade() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        if (grades.containsKey(name)) {
            System.out.print("Enter new grade: ");
            int grade = scanner.nextInt();
            grades.put(name, grade);
            System.out.println("Grade updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void viewGrades() {
        if (grades.isEmpty()) {
            System.out.println("No records available.");
        } else {
            grades.forEach((name, grade) -> System.out.println(name + ": " + grade));
        }
    }
}
