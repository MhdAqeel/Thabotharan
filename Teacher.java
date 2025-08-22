public class Teacher extends Person{
    private int numCourses = 0; //a teacher can teach upto 5 courses
    private String [] courses = new String [5] ;

    public Teacher (String name ,String address){
        super(name, address);
    }
    public String toString (){
        return "Teacher : \n"+super.toString();
    }
    public boolean addCourse(String course){
        for (int i = 0; i < numCourses; i++) {
                    if (courses[i].equals(course)) {
                        return false; // already exists
                    }
                }
                if (numCourses < 5) {
                    courses[numCourses] = course;
                    numCourses++;
                    return true;
                }
                return false; // max limit reache    
    }
    
    public boolean removeCourse(String course){
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                // shift elements left
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false; // course not found
    }
}
