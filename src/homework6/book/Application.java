package homework6.book;

public class Application {
    public static void main(String[] args) {
        Library library = new Library(5);
        library.addBook("Гаррі-Потер", "Rostik", "Вільна", 2005);


        System.out.println(library);

        System.out.println("==============");
        library.addBook("Гаррі-Потер 2", "Ne Rostik", "Вільна", 1963);
        System.out.println(library);
        System.out.println("==============");
        library.addBook("Гаррі-Потер 3", "567r8", "Вільна", 1793);
        System.out.println(library);
        library.addBook("Гаррі-Потер 4", "567r6263263628", "Вільна", 2015);
        System.out.println(library);
        library.addBook("Fortnite", "Xz", "Вільна", 2025);
        System.out.println(library);
        System.out.println("========================");
        library.displayAvailableBooks();
        library.borrowBook("Гаррі-Потер");
        library.borrowBook("Гаррі-Потер 3");
        System.out.println(library);
        System.out.println("========================");
        library.returnBook("Гаррі-Потер 3");
        System.out.println(library);
        System.out.println("========================");
        library.newOrOld();
    }
}
