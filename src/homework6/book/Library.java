package homework6.book;

import java.util.Arrays;

public class Library {
    private Book[] books;
    private int indexOfBook;



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

    public void addBook(String title, String author,String statusBook, int year){
        if (indexOfBook < books.length){
            Book book = new Book(title, author, statusBook, year);
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
                books[i].setStatusBook("Заброньована");

            }
            }
        }


    public void returnBook(String seachTitle){

        for (int i = 0; i < indexOfBook; i ++){

            if(books[i].getTitle() == seachTitle){
                if (books[i].getStatusBook() == "Заброньована") {
                    System.out.println("Книга " + seachTitle +" була повернена");
                    books[i].setStatusBook("Вільна");


                }


            }
        }

    }

    public void newOrOld(){
        for (int i = 0; i < indexOfBook; i ++){
            if (books[i].getYear() > 2000) {
                System.out.println("Книга " + books[i].getTitle() + " є новою");
            }else {
                System.out.println("Книга " + books[i].getTitle() + " є старою");
            }
        }
    }



    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books);
    }
}
