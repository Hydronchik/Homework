package homework8.printer;

public class OfficeWorker {
    private Printer printer;
    public void doWork(Printer printer) {

        printer.printDocument();
        System.out.println("Працює");
    }
}
