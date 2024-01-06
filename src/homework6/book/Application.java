package homework6.book;

public class Application {
    public static void main(String[] args) {
        Library library = new Library(2);
        library.addBook("Гаррі-Потер", "1234");

        System.out.println(library);

        System.out.println("==============");
        library.addBook("Гаррі-Потер 2", "5678");
        System.out.println(library);
        System.out.println("==============");
        library.addBook("Гаррі-Потер 3", "567r8");
        System.out.println(library);
    }
}
