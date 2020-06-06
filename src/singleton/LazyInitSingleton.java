package singleton;

/**
 * singleton to initialized only when called and not with a static block
 */
public class LazyInitSingleton {

    private static LazyInitSingleton instance;

    private LazyInitSingleton() {
        System.out.println("initilization lazy singleton");
    }

/*    public static synchronized LazyInitSingleton getInstance() {
        if(instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }*/

    //double-check locking --out dated

    /**
     * double-check locking -- out dated approach
     *  instance variable checked twice, thus double locking
     *
     *
     * This does make thread safe but slow
     *
     * @return
     */
    /*public static LazyInitSingleton getInstance() {
        if(instance == null) {
            synchronized (LazyInitSingleton.class) {
                if(instance == null) {
                    instance = new LazyInitSingleton();
                }
            }
        }
        return instance;
    }*/
}
