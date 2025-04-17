
public class Main{

public static void main(String[] args) {
       Library library = new Library();
    Member member1 = new Member("Rutu", "28");
    Member member2 = new Member("Jeet", "05");

    library.registerMember(member1);
    library.registerMember(member2);

    Book book1 = new Book("Project Java", "RJ", "123");
    EBook ebook1 = new EBook("Way to Java Developer", "RJ", "2805", "PDF");
    
    library.addBook(book1);
    library.addBook(ebook1);

    library.borrowBook(book1);
    library.borrowBook(ebook1);
    library.returnBook(book1);
    library.returnBook(ebook1);

}

}