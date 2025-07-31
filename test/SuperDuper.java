package test;

public class SuperDuper {
    public static void main (String [] args){
        Cat mycat = new Cat();
        Cat neibourCat = new Cat("kitty", 10, "White", "White"); 
        mycat.makeNoice();
        System.out.println();
        neibourCat.makeNoice();
        System.out.println();
    }
}
