public class Cat extends Animal{
    
    @Override
    public void makeSound(){
        System.out.println("Meow Meow");
    }

    @Override
    public void move(){
        System.out.println("I am the fastest cat alive !!!");
    }
}