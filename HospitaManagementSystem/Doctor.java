public class Doctor extends Person implements Schedulable {
    String surgeryType;
    String date;

    public Doctor (String name, int age, int id ){
        super(name, age, id);
        surgeryType = "GenralPhycician";
    }
    public Doctor (String name, int age, int id, String surgen ){
        super(name, age, id);
        surgeryType = surgen;
    }

    public String schedule(String date) {
        this.date = date;
        return "Scheduled for " + date;
    }

    @Override
    public void dispalyInfo(){
        System.out.println("------Doctor-------"+
        "\n Name : "+ this.name + 
        "\n Age : "+ this.age + 
        "\n ID : "+ this.id +
        "\n Position : "+ this.surgeryType);
    }
}
