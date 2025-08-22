public class Student extends Person{
    private int numCourses = 0;
    private String [] courses = new String [30];      //a student can study upto maximum of 30 courses
    private int [] grades = new int[30];

    public Student (String name , String adress) {
        super(name , adress);
    }

    public String toString () {
        return "student : \n"+super.toString();
    }

    public void addCourseGrade(String course , int grade){
        courses [numCourses] = course;
        grades [numCourses] = grade;
        numCourses++;
    }

    public void printGrades(){
        for (int i = 0 ; i < numCourses ; i++ ){
            System.out.println(courses [i] +" = " + grades [i] );
        }
    }

    public double getAverageGrade(){
        int sum = 0;
        for (int i =0 ; i<numCourses ; i++){
            sum+= grades [i];
        }
        return (double) sum/numCourses;
    }
}
