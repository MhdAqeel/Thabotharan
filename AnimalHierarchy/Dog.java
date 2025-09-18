public class Dog extends Animal{
    
    @Override
    public void makeSound(){
        System.out.println("Wof wof");
    }

    @Override
    public void move(){
        System.out.println("I am the fastest dog alive !!!");
    }
}