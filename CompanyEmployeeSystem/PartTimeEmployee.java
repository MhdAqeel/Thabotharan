public class PartTimeEmployee{
    int hourswork;
    double hourlyRate;
    public  PartTimeEmployee(String name. int hourswork , double hourlyRate){
        super (name);
        this.hourswork = hourswork;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hourlyRate*hourswork;
    }
}