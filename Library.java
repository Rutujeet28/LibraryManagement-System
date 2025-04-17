import java.util.ArrayList;
import java.util.List;

public class Library{
private List<Book> books = new ArrayList<>();
private List<Member> members = new ArrayList<>();

public Library(){}

public void addBook(Book book)
{
    books.add(book);
    System.out.println(book.getTitle() + "has been added to the library.");
}

public void registerMember(Member member)
{
    members.add(member);
    System.out.println(member.getName() + "has been registered.");
}


public void borrowBook(Book book){
    book.borrowBook();
}
    
public void returnBook(Book book){
    book.returnBook();
}

}