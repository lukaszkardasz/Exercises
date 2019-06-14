package Library.model;

public class Book extends Publication{
    // variables

    private String author;
    private int pages;
    private String isbn;

    // constructors

    public Book(String title, String author,int year, int pages, String publisher, String isbn) {
        super(year, publisher, title);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    //getters and setters


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printInfo(){
        String info = getTitle() + "; " + author + "; " + getYear() + "; "
                + pages + "; " + getPublisher()+"; " + isbn;
        System.out.println(info);
    }



}


