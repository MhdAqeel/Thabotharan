package test;

public class Animal {
    private String name;
    private int age;
    private String color;
    public final String DEAFULT_NAME = "Mirugam";
    public final int DEAFULT_AGE = 1;
    public final String DEFAULT_COLOR="Brown";

    public Animal(){
        this.name=DEAFULT_NAME;
        this.age  = DEAFULT_AGE;
        this.color = DEFAULT_COLOR;
    }
    public Animal(String name, int age , String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void makeNoice(){
        System.out.println("Hey i am a animal");
    }

    public void eat(){
        System.out.println("munch munch munch...........");
    }
    
}
