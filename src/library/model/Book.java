package library.model;

import java.util.Objects;

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

    @Override
    public String toString() {
        return super.toString() +
                " Author: " + getAuthor() +
                " pages: " + getPages() +
                " isbn: " + getIsbn();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return pages == book.pages &&
                Objects.equals(author, book.author) &&
                Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author, pages, isbn);
    }
}


