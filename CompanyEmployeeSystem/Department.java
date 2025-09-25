import java.util.*;
public class Department{
    list <Employee> employees = new ArrayList<>();

    public  void addEmployee(Employee e){
        employees.add(e);
    }

    public void showSalary(){
        for (Employee e : employees){
            System.out.println(e.name + "earns $ "+ e.calculateSalary());
        }
    }
}