public abstract class Person {
    String name;
    int age;
    int id;

    public Person(String name, int age, int id){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public abstract void dispalyInfo();
}
