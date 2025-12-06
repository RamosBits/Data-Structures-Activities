public class Student {
    private String id;
    private String name;
    private String course;
    private int year;
    private double gpa;

    public Student(String id, String name, String course, int year, double gpa) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.year = year;
        this.gpa = gpa;
    }

    // GETTERS
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    public double getGpa() {
        return gpa;
    }

    // SETTERS (if you want updates)
    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + course + " | Year " + year + " | GPA: " + gpa;
    }
}
