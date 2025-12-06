/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author caryd
 */
import java.util.*;

public class StudentManager {

    private ArrayList<Student> studentList = new ArrayList<>();
    private HashMap<String, Student> studentMap = new HashMap<>();
    private Stack<Student> undoStack = new Stack<>();

    // Add a student
    public void addStudent(Student s) {
        studentList.add(s);
        studentMap.put(s.getId(), s);
    }

    // Search by ID (HashMap)
    public Student searchByID(String id) {
        return studentMap.get(id);
    }

    // Linear search by name
    public Student searchByName(String name) {
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // Sort by name
    public void sortByName() {
        studentList.sort(Comparator.comparing(Student::getName));
    }

    // Delete student
    public void deleteStudent(String id) {
        Student s = searchByID(id);
        if (s != null) {
            undoStack.push(s);
            studentList.remove(s);
            studentMap.remove(id);
        }
    }

    // Undo last delete
    public void undoDelete() {
        if (!undoStack.isEmpty()) {
            Student s = undoStack.pop();
            studentList.add(s);
            studentMap.put(s.getId(), s);
        }
    }

    // Display all
    public void displayAll() {
        for (Student s : studentList)
            System.out.println(s);
    }
}
