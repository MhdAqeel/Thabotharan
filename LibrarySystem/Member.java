public class Member {
    private String name;

    public Member (String name){
        this.name = name;
    }

    public void borrowBook(Book b){
        System.out.println(name + " borrowed "+ b.title );
    }
}