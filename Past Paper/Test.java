public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Aqeel");
        Student s2 = new Student("Jasool");

        Course maths = new Course("Maths");
        Course science = new Course("Science");
        Course english = new Course("English");
        Course history = new Course("History");
        Course geography = new Course("Geography");

        s1.assignCourse(maths);
        s1.assignCourse(science);
        s1.assignCourse(english);

        s2.assignCourse(english);
        s2.assignCourse(history);

        s1.studentDetails();
        s2.studentDetails();
    }
}