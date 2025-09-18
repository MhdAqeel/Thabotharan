import java.util.ArrayList;
import java.util.List;
public class Library{
    private List <Book> books  = new ArrayList<>();

    public void addBook(Book b){
        books.add(b);
    }

    public void showBooks () {
        for (Book b : books) {
            System.out.println(b.title + " by " + b.author);
        }
    }
}