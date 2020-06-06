package factory;
/*
 The constructor is a private constructor so no chance of initializing it from outside the class.
 In cases like these, factory methods come in handy for initializations,
 Factory methods/classes initialize the whole class not partial fields like builders
 */
public class Demo {
    public static void main(String[] args) {

    }
}
enum CoordinateSystem {
    CARTESIAN,
    POLAR
}

class Point {
    private double x, y;

    /**
     * @param x
     * @param y
     */
    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // Since Java doesnot allow overloading of constructors with the same set of arguments,
    // but the initialization can vary
/*    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double rho, double theta) {
        x = rho * Math.cos(theta);
        y = rho * Math.sin(theta);
    }*/
    // Not an ideal way of initialization, makes constructors ugly
    /*private Point(double a, double b, CoordinateSystem cs) {
        switch(cs) {
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = a * Math.sin(b);        }
    }*/

   /* // Factory methods init in play

    public static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }

    public static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }*/


    /**
     * This throws error since constructor private, if constructor made public, no use of factory init
     * there will be two ways of initialization
     */
    static class  Factory {
        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y);
        }

        public static Point newPolarPoint(double rho, double theta) {
            return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
        }
    }
}


