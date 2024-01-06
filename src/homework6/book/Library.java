package homework6.book;

import java.util.Arrays;

public class Library {
    private Book[] books;
    private int indexOfBook;
    private Book book;


    public int getIndexOfBook() {
        return indexOfBook;
    }

    public void setIndexOfBook(int indexOfBook) {
        this.indexOfBook = indexOfBook;
    }

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.indexOfBook = 0;

    }

    public void addBook(String title, String author){
        if (indexOfBook < books.length){
            Book book = new Book(title, author);
            books[indexOfBook] = book;
            indexOfBook++;

            System.out.println("Book successfully added");
        }else{

            System.out.println("Збільшіть слоти в бібліотеці щоб додати ще 1 книгу");
        }
    }



    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books);
    }
}
