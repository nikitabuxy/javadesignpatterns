package lsp;

/**
 * LSP : Liskov Substitution Principle : user should be able to substitute a derived class for a base class
 *
 */
public class Demo {

    static void useIt(Rectangle r) {
        int width = r.width;
        r.setHeight(10);
        //area = width * 10
        System.out.println( "Expected area of " + (width * 10) +
                ", got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2,3);
        useIt(rc);

        Rectangle square = new Square();
        square.setWidth(5);
        useIt(square);
    }
}
