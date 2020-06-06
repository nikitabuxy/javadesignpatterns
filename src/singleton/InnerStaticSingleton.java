package singleton;

/**
 * Inner static singleton initialization
 * This approach avoids the problem of synchronization
 * no need of handling thread safety
 */
public class InnerStaticSingleton {
    private InnerStaticSingleton(){

    }

    /**
     * Inner class can access private constructors of outer classes
     */
    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }

}
