package isp;

import isp.operations.Machine;

/**
 *  Old Fashioned printer can print a document a printer but doesnot know how to fax or scan.
 *  If left empty still giving user a chance to fax or scan. try to call method, user confused why nothing is happening
 */
public class OldFashionedPrinter implements Machine {
    @Override
    public void print(Document d) {

    }

    @Override
    public void fax(Document d) {
        // requires exception to be thrown
        //throw new Exception("Not implemented");
    }

    @Override
    public void scan(Document d) {

    }
}
