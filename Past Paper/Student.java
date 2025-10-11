import java.util.*;

public class Student {
    private static final int MAX_COURSES = 2;
    private final List<Course> courses = new ArrayList<>();
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean assignCourse(Course course) {
        if (courses.size() < MAX_COURSES) {
            courses.add(course);
            return true;
        } else {
            System.out.println( this.name +" has already chosen two courses.");
            return false;
        }
    }

    public void studentDetails() {
        System.out.println(name + "'s Courses: " + courses);
    }
}