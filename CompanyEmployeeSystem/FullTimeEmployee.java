public class FullTimeEmployee extends Employee{
    double mothlySalary;
    public FullTimeEmployee(String name, double mothlySalary){
        super(name);
        this.mothlySalary=mothlySalary;
    }

    @Override 
    public double calculateSalary(){
        return mothlySalary;
    }
}