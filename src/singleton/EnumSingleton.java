package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * instead of making a class ,create a enum
 * an enum has finite number of instances
 * Enums: are serialized by default , have private default constructor, implicitely serializable -- neednot
 *                                                                                              impl serializable
 * drawback: cannot inherit from this
 * this approach ca nbe used if state is not required to be persisted
 */
public enum EnumSingleton {
    INSTANCE; // only name of instance serialized
    EnumSingleton() {
        value = 42;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


class EnumDemo {

    // 2. in demo here
    static void saveToFile(EnumSingleton enumSingleton, String filename) throws Exception {
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(enumSingleton);   // serialization here
        }
    }

    static EnumSingleton readFromFIle(String fileName) throws Exception {
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (EnumSingleton) in.readObject();
        }
    }
    public static void main(String[] args) throws Exception {

        String filename = "myfile.bin";

        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.setValue(111);
        saveToFile(singleton, filename);

        EnumSingleton singleton1 = readFromFIle(filename);
        System.out.println(singleton1.getValue());
    }
}
