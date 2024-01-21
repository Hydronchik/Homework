package homework6.book;

public class Book {
    private String title;
    private String author;
    private String statusBook;
    private int year;

    public Book(String title, String author, String statusBook, int year) {
        this.title = title;
        this.author = author;
        this.statusBook = statusBook;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(String statusBook) {
        this.statusBook = statusBook;
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", statusBook='" + statusBook + '\'' +
                ", year=" + year +
                '}';
    }
}
