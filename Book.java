public class Book{
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

public Book(String title, String author, String ISBN){
    this.title = title;
    this.author = author;
    this.ISBN = ISBN;
    this.isAvailable = true;

}

public String getTitle()
{
    return title;
}

public String getAuthor(){
    return author;
}

public String getISBN(){
    return ISBN;
}

public boolean isAvailable(){
    return isAvailable;
}

public void setAvailable(boolean available){
    this.isAvailable = available;
}


public void borrowBook(){
    if(isAvailable){
        setAvailable(false);
        System.out.println(title + "has been borrowed.");
    }
    else{
        System.out.println(title + "is not available.");
    }
}

public void returnBook(){
    setAvailable(true);
    System.out.println(title + "has been returned.");
}

}
