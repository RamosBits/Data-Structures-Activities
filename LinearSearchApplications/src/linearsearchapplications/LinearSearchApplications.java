/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearchapplications;
import java.util.Scanner;
/**
 *
 * @author RAMOS_CPE
 */
public class LinearSearchApplications {

    // Linear Search method: returns index if found, -1 if not found
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }

    // Linear Search method for counting duplicates (e.g., multiple book copies)
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example 1: Student ID Lookup
        int[] studentIDs = {105, 210, 356, 478, 512, 630};
        System.out.print("Enter Student ID to search: ");
        int targetID = sc.nextInt();
        int pos = linearSearch(studentIDs, targetID);
        if (pos != -1) {
            System.out.println("✅ Student ID " + targetID + " found at position " + pos);
        } else {
            System.out.println("❌ Student ID " + targetID + " not found.");
        }

        // Example 2: Library Book Finder (with duplicates)
        int[] bookCodes = {501, 630, 478, 501, 105, 501};
        System.out.print("\nEnter Book Code to search: ");
        int targetBook = sc.nextInt();
        int count = countOccurrences(bookCodes, targetBook);
        if (count > 0) {
            System.out.println("✅ Book Code " + targetBook + " found. Copies available: " + count);
        } else {
            System.out.println("❌ Book Code " + targetBook + " not found in inventory.");
        }

        // Example 3: Attendance Checking (simple name search)
        String[] students = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
        System.out.print("\nEnter Student Name to check attendance: ");
        sc.nextLine(); // clear buffer
        String targetName = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(targetName)) {
                System.out.println("✅ " + targetName + " is present at roll call position " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("❌ " + targetName + " not found in the class list.");
        }

        sc.close();
    }
}
