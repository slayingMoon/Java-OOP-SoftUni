package DesignPatterns_Lab.prototype;

public class Book extends Item {
    private String author;

    public Book(String name, String imgURL, double price) {
        super(name, imgURL, price);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                '}';
    }

}

