package lab8_hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentDirectory {

    private HashMap<String, Student> students = new HashMap<>();

    public void addStudent(Student s) {
        students.put(s.getId(), s);
    }

    public Student getStudent(String id) {
        return students.get(id);
    }

    public void updateGrade(String id, double newGrade) {
        if (students.containsKey(id)) {
            students.get(id).setGrade(newGrade);
        }
    }

    public void printAllStudents() {
        System.out.println("Student Directory:");
        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
