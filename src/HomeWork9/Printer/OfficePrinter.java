package HomeWork9.Printer;

public class OfficePrinter implements Printer{
    private InkjetPrinter inkjetPrinter;

    public OfficePrinter(InkjetPrinter inkjetPrinter) {
        this.inkjetPrinter = inkjetPrinter;
    }

    @Override
    public void print(String message) {
        inkjetPrinter.print("f");
    }
}
