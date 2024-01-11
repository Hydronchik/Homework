package homework6.book;

import java.util.Arrays;

public class Library {
    private Book[] books;
    private int indexOfBook;
    private boolean booksStatus[];

    public boolean[] getBooksStatus() {
        return booksStatus;
    }

    public void setBooksStatus(boolean[] booksStatus) {
        this.booksStatus = booksStatus;
    }

    public int getIndexOfBook() {
        return indexOfBook;
    }

    public void setIndexOfBook(int indexOfBook) {
        this.indexOfBook = indexOfBook;
    }

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.indexOfBook = 0;
        this.booksStatus[indexOfBook] = true;


    }

    public void addBook(String title, String author){
        if (indexOfBook < books.length){
            Book book = new Book(title, author);
            books[indexOfBook] = book;

            indexOfBook++;




            System.out.println("Книжка " + title + " від автора " + author + " успіщно додана");
        }else{
            System.out.println("Збільшіть слоти в бібліотеці щоб додати ще 1 книгу");
        }
    }
    public void displayAvailableBooks(){
        for (int i = 0; i < indexOfBook; i ++){
            System.out.println(books[i]);
        }
    }
    public void borrowBook(String seachTitle){
        for (int i = 0; i < indexOfBook; i ++){

            if(books[i].getTitle() == seachTitle){
                System.out.println("Книга " + seachTitle + " найдена");
                booksStatus[i] = false;
                return;
            }else {
                System.out.println("Kниги "+ seachTitle +" не знайдено");
                return;
            }
        }
    }



    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books);
    }
}
