public class Teacher extends Person{
    private int numCourses = 0; //a teacher can teach upto 5 courses
    private String [] courses = {};

    public Teacher (String name ,String address){
        super(name, address);
    }
    public String toString (){
        return "";
    }
    public boolean addCourse(String course){
        return ;
    }
    public boolean removeCourse(String course){
        return;
    }
}
