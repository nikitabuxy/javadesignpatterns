package prototype;

import java.io.Serializable;

public class DemoSerializationCopy {
    public static void main(String[] args) {
        Foo foo1 = new Foo(42, "stuffffff");
        // It does a round trip, meaning serializes the object and objects inside objects then deserializes them back, so in
        // a way coping by value, it gives a new object after serialization and deserialization
        //Foo fooCopy = SerializationUtils.roundtrip(foo1);


    }
}

class Foo implements Serializable{
    public int stuff;
    public String fooStrStuff;

    public Foo(int stuff, String fooStrStuff) {
        this.stuff = stuff;
        this.fooStrStuff = fooStrStuff;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "stuff=" + stuff +
                ", fooStrStuff='" + fooStrStuff + '\'' +
                '}';
    }
}