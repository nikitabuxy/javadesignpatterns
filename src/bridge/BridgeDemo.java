package bridge;

/**
 * Bridge Design Pattern
 * Bridge decouples interfaces/hierarchies form hierarchies
 * could be replaced with inheritance and aggregation
 * avoids the cartesian product 2 * 2 => 4
 */

// Shape -> Circle, Square
// Rendering -> Vector , Rester
//VectorCircle, VectorSquare, CircleRestor

interface Renderer {
    void renderCircle(float radius);
}

class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing a circle of radius: " + radius);
    }
}

class RasterRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing pixels for a circle of radius: " + radius);
    }
}

abstract class Shape {

    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
    public abstract void resize(float factor);
}

class Circle extends Shape {

    public float radius;

    // @Inject --> google juice
    public Circle(Renderer renderer) {
        super(renderer);
    }

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void resize(float factor) {
        radius *= factor;
    }
}
public class BridgeDemo {

    public static void main(String[] args) {
        RasterRenderer raster = new RasterRenderer();
        VectorRenderer vector = new VectorRenderer();
        Circle circle = new Circle(vector, 5);
        circle.draw();
        circle.resize(2);
        circle.draw();

       /* Injector injector = Guice.createInjector(new ShapeModule());
        Circle instance = injector.getInstance(Circle.class);
        instance.radius = 3;
        instance.draw();
        instance.resize(2);
        instance.draw();*/
    }
}

/**
 * The benefit of using google juice here is that you can specify what kind of renderer is to be used
 * Only a single point to define for the entire app\
 * This way bridge DP impl
 */
/*

class ShapeModule extends AbstractModule {
    @Override
    protected  void configure() {
        bind(Renderer.class).to(VectorRenderer.class);
    }
}*/
