/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayoperations;

/**
 *
 * @author caryd
 */
public class ArrayOperations {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // Test Insert
        arr = insertAtPosition(arr, 2, 99); // Insert 99 at index 2
        System.out.println("After Insert:");
        printArray(arr);

        // Test Delete
        arr = deleteAtPosition(arr, 3); // Delete element at index 3
        System.out.println("After Delete:");
        printArray(arr);

        // Test Find Max & Min
        int[] maxMin = findMaxMin(arr);
        System.out.println("Max = " + maxMin[0] + ", Min = " + maxMin[1]);
    }

    // Insert
    public static int[] insertAtPosition(int[] arr, int position, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        newArr[position] = value;
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    // Delete
    public static int[] deleteAtPosition(int[] arr, int position) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        for (int i = position; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }

    // Find Max & Min
    public static int[] findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{max, min};
    }

    // Helper to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
