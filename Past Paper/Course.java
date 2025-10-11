public class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setCourse(String courseName) {
        this.courseName = courseName;
    }

    public String getCourse() {
        return this.courseName;
    }

    @Override
    public String toString() {
        return courseName;
    }
}