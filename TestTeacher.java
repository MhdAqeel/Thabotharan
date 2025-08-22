public class TestTeacher {
    public static void main(String[] args) {
        // Test Student
        Student s1 = new Student("Aqeel", "Chilaw");
        s1.addCourseGrade("Math", 85);
        s1.addCourseGrade("Science", 90);
        System.out.println(s1);
        s1.printGrades();
        System.out.println("Average: " + s1.getAverageGrade());

        System.out.println();

        // Test Teacher
        Teacher t1 = new Teacher("Mr.Walter White", "Californiya");
        t1.addCourse("Math");
        t1.addCourse("Science");
        System.out.println(t1);
        System.out.println("Remove Math: " + t1.removeCourse("Math"));
        System.out.println("Remove History: " + t1.removeCourse("History"));
    }
}
