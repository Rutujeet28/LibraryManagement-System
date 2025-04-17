public abstract class LibraryItem{
    protected String title;
    protected boolean isAvailable;

    public LibraryItem(String title){
        this.title = title;
        this.isAvailable = true;
    }

    public abstract void borrow();

    public abstract void returnItem();

    public boolean isAvailable(){
        return isAvailable;
    }


    public String getTitle(){
        return title;
    }

    public void setAvailable(boolean available){
        this.isAvailable = available;
    }


    public class Book extends  LibraryItem{

    public Book(String title){
        super(title);
    }

    @Override
    public void borrow(){
        if(isAvailable){
            setAvailable(false);
            System.out.println(title + " has been borrowed.");
        }
        else{
            System.out.println(title + " is not available.");
        }
    }

    @Override
    public void returnItem(){
        setAvailable(true);
        System.out.println(title +  " has been returned.");
    }

} 
}

