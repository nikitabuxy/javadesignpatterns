package singleton;

import java.io.File;
import java.io.IOException;

/**
 * Static initialization of singleton class :
 * If initialization can throw error by some means : approach to be changed like create a static block with try/catch
 */
public class StaticBlockSingleton {

    private StaticBlockSingleton() throws IOException {
        System.out.println("Singleton is initializing");
        File.createTempFile(".", "."); //invalid creation of file
    }

    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();

        }catch (Exception e) {
            System.out.println("Failed to create singleton");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
