package Concept.Design_patterns.builder;

public class BuilderBook {
    private String isbn;
    private String title;
    private String author;
    private String description;
    private int price;

    private BuilderBook() {}
    public static BuilderBook builder() {
        return new BuilderBook();
    }
    public BuilderBook isbn(String isbn) {
        this.isbn = isbn;
        return this;
    }
    public BuilderBook title(String title) {
        this.title = title;
        return this;
    }
    public BuilderBook author(String author) {
        this.author = author;
        return this;
    }
    public BuilderBook description(String description) {
        this.description = description;
        return this;
    }
    public BuilderBook price(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "BuilderBook [isbn=" + isbn + ", title=" + title + ", author=" + author + ", description=" + description
                + ", price=" + price + "]";
    }
}
