package homework8.printer;

public class Application {
    public static void main(String[] args) {
        Printer printer = new Printer();
        OfficeWorker officeWorker = new OfficeWorker();

        officeWorker.doWork(printer);
    }

    }

