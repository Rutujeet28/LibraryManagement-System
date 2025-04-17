public class EBook extends Book{
    private String fileFormat;

    public EBook(String title, String author, String ISBN, String fileFormat)
    {
        super(title, author, ISBN);
        this.fileFormat = fileFormat;
    }

    public String getFileFormat(){
        return fileFormat;
    }

    @Override
    public void borrowBook(){
        if(isAvailable()){
            setAvailable(false);
            System.out.println(getTitle() +  " (Ebook) has been borrowed.");
        }
        else{
            System.out.println(getTitle() + " (Ebook) is not available");
        }
    }

    @Override
    public void returnBook(){
        setAvailable(true);
        System.out.println(getTitle() + " (Ebook) has been returned.");
    }
}