package isp;

import isp.operations.MultiFunctionDevice;
import isp.operations.Printer;
import isp.operations.Scanner;

/**
 * The multiple functionality can be obtained by extending an interface or the Decorator DP
 */
public class MultiFunctionMachine implements MultiFunctionDevice {

    private Printer printer;
    private Scanner scanner;

    public MultiFunctionMachine(Printer pr, Scanner sc) {
        this.printer = pr;
        this.scanner = sc;
    }
    @Override
    public void print(Document d) {
        printer.print(d);
    }

    @Override
    public void scan(Document d) {
        scanner.scan(d);
    }
}
