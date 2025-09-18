public class Test {
    public static void main (String [] args){
        //test for cat
        Cat c1 = new Cat();
        c1.makeSound();
        c1.move();

        //test for dog
        System.out.println();
        Dog d1 = new Dog ();
        d1.makeSound();
        d1.move();

    }
}