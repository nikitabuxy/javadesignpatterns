package isp.operations;

import isp.Document;

@Deprecated
public interface Machine {

    void print(Document d);

    void fax(Document d);

    void scan(Document d);
}
