package lab8_hashmap;

import java.util.HashMap;
import java.util.Map;

public class GradeManager {

    private HashMap<String, Double> grades = new HashMap<>();

    public void addGrade(String name, double grade) {
        grades.put(name, grade);
    }

    public Double getGrade(String name) {
        return grades.get(name);
    }

    public boolean hasStudent(String name) {
        return grades.containsKey(name);
    }

    public void removeStudent(String name) {
        grades.remove(name);
    }

    public void printAll() {
        System.out.println("All Grades:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
