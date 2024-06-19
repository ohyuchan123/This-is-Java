package Concept.Design_patterns.builder;

import javax.swing.*;

public class NormalBook {
    private String isbn;
    private String title;
    private String author;
    private String description;
    private int price;

    public NormalBook() {}
    public NormalBook(String isbn, String title, String author, String description, int price) {
        super();
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
    }

    public NormalBook(String isbn, String title, String author) {
        super();
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "NormalBook [isbn=" + isbn + ", title=" + title + ", author=" + author + ", description=" + description
                + ", price=" + price + "]";
    }
}
