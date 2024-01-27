package HomeWork9.Printer;

public class Application {
    public static void main(String[] args) {
        InkjetPrinter inkjetPrinter = new InkjetPrinter();
        inkjetPrinter.print("Я тут");
        OfficePrinter officePrinter = new OfficePrinter(inkjetPrinter);
        officePrinter.print("fa");
    }
}
