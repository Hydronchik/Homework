package homework6.book;

public class Application {
    public static void main(String[] args) {
        Library library = new Library(5);
        library.addBook("Гаррі-Потер", "Rostik");


        System.out.println(library);

        System.out.println("==============");
        library.addBook("Гаррі-Потер 2", "Ne Rostik");
        System.out.println(library);
        System.out.println("==============");
        library.addBook("Гаррі-Потер 3", "567r8");
        System.out.println(library);
        library.addBook("Гаррі-Потер 4", "567r6263263628");
        System.out.println(library);
        library.addBook("Fortnite", "Xz");
        System.out.println(library);

        library.displayAvailableBooks();
        library.borrowBook("Гаррі-Потер");
    }
}
