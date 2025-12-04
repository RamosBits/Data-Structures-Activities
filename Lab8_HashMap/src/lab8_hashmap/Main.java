package lab8_hashmap;

public class Main {
    public static void main(String[] args) {

        // ---- Task 1 & 2: Grade Manager ----
        GradeManager gm = new GradeManager();
        gm.addGrade("Alice", 89.5);
        gm.addGrade("Ben", 91.0);
        gm.addGrade("Carla", 85.5);

        System.out.println("Ben's grade: " + gm.getGrade("Ben"));
        gm.printAll();

        gm.removeStudent("Carla");
        System.out.println("\nAfter removing Carla:");
        gm.printAll();


        // ---- Task 3: Student Directory ----
        StudentDirectory sd = new StudentDirectory();
        sd.addStudent(new Student("2025-001", "Alice", 89.5));
        sd.addStudent(new Student("2025-002", "Ben", 91.0));
        sd.addStudent(new Student("2025-003", "Carla", 85.5));

        System.out.println("\nRecord for ID 2025-002:");
        System.out.println(sd.getStudent("2025-002"));

        sd.updateGrade("2025-003", 90.0);
        System.out.println("\nAll Students:");
        sd.printAllStudents();


        // ---- Task 4: Inventory System ----
        Inventory inv = new Inventory();
        inv.addProduct("P001", 10);
        inv.addProduct("P002", 5);
        inv.updateStock("P001", 15);

        System.out.println("\nInventory:");
        inv.displayProducts();


        // ---- Problem 3: Frequency Counter ----
        FrequencyCounter fc = new FrequencyCounter();
        var freq = fc.countLetters("A cat and a car collided");

        System.out.println("\nLetter Frequency:");
        fc.printFrequency(freq);
    }
}
