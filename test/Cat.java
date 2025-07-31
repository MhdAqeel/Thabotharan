package test;

public class Cat extends Animal {
    private String catFfoodPrefernce;

    public Cat (){

    }
    public Cat (String name, int age ,String color, String catFfoodPrefernce){
        super(name, age, color);
        this.catFfoodPrefernce = catFfoodPrefernce;
    }
    public void makeNoice(){
        super.makeNoice();
        System.out.println("meyyow meyyow meyoww");
        eat();
    }
}
