package singleton;

import java.io.*;
import java.util.function.Supplier;

/**
 * Breaking single instance of a singleton class
 * 1. By reflection
 * 2. Using serialization : when deserialize an object , JVM doesnt create if object is final, it goes ahead and create
 * an object
 *
 * SOLUTION for 2: to implement serialization in the class to preserve the behaviour of singleton pattern(class here)
 */
public class BasicSingleton implements Serializable{

    private BasicSingleton() {
    }
    // to create the one and only instance of the class without duplication -- creating a private instance
    private static final BasicSingleton INSTANCE = new BasicSingleton();

    // creating a public getter  -- to expose the instance
    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    private int value = 0;

    public int getValue() {
        return  value;
    }

   public void  setValue(int value) {
        this.value = value;
    }

        // letting JVM know that whenever seriliaztion happens it has to happen in the context of this instance to create new obj
    protected Object readResolve() {
        return INSTANCE;
    }
}

class Demo {

    // 2. in demo here
    static void saveToFile(BasicSingleton basicSingleton, String filename) throws Exception {
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(basicSingleton);   // serialization here
        }
    }

    static BasicSingleton readFromFIle(String fileName) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (BasicSingleton) in.readObject();
        }
    }
    public static void main(String[] args) throws Exception {
/*        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(123);
        System.out.println(singleton.getValue());*/
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(1432);

        String filename = "singleton.bin";
        saveToFile(singleton, filename);
        singleton.setValue(123);

        BasicSingleton singleton2 = readFromFIle(filename);

        System.out.println(singleton == singleton2); // will be false since a new instance is created of the singleton class

        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}