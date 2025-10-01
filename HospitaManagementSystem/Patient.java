public class Patient extends Person implements Schedulable,Payable{
    String date;

    public Patient(String name , int age , int id){
        super(name, age, id);
    }

    public String schedule (String date){
        this.date=date;
    }
    
    public void generateBill(double amount){
        System.out.println("------Invoice-------"+
        "\n Amount : " + amount);
    }  

    @Override
    public void dispalyInfo(){
        System.out.println("------Patient-------"+
        "\n Name : "+ this.name + 
        "\n Age : "+ this.age + 
        "\n ID : "+ this.id);
    }
}
