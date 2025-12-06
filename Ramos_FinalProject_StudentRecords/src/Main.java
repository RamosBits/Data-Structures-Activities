/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caryd
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int choice;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Search Student by Name");
            System.out.println("4. Delete Student");
            System.out.println("5. Undo Delete");
            System.out.println("6. Sort by Name");
            System.out.println("7. Display All Students");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Course: ");
                    String course = sc.nextLine();

                    System.out.print("Year: ");
                    int year = sc.nextInt();

                    System.out.print("GPA: ");
                    double gpa = sc.nextDouble();

                    manager.addStudent(new Student(id, name, course, year, gpa));
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    Student s1 = manager.searchByID(sc.nextLine());
                    System.out.println(s1 != null ? s1 : "Not found.");
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    Student s2 = manager.searchByName(sc.nextLine());
                    System.out.println(s2 != null ? s2 : "Not found.");
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    manager.deleteStudent(sc.nextLine());
                    break;

                case 5:
                    manager.undoDelete();
                    break;

                case 6:
                    manager.sortByName();
                    break;

                case 7:
                    manager.displayAll();
                    break;
            }

        } while (choice != 0);

        System.out.println("Exiting...");
    }
}
