package HomeWork9.Printer;

public class InkjetPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("InkjetPrinter: " + message);
    }
}
