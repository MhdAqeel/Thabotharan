public class Test{
    public static void main (String [] args){
        Department dep = new Department();
        dep.addEmployee(new FullTimeEmployee("Alice " , 3000));
        dep.addEmployee(new PartTimeEmployee("bob", 20 , 15 ));
        dep.showSalary();
    }
}