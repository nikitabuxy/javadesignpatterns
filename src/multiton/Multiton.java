package multiton;

import java.util.HashMap;

/**
 * allowed to crate multiple instances of a class, but controlled
 * initialized in lazy loading
 */
enum SubSystem{
    PRIMARY,
    AUXILIARY,
    FALLBACK
}

class Printer {

    private static int instanceCount = 0;
    private Printer() {
        instanceCount++;
        System.out.println("Instances created so far " + instanceCount);
    }

    private static HashMap<SubSystem, Printer> instances = new HashMap<>();
    public static Printer get(SubSystem ss) {
        if(instances.containsKey(ss)) {
            return instances.get(ss);
        }
        Printer instance = new Printer();
        instances.put(ss, instance);
        return instance;
    }
}
public class Multiton {

    public static void main(String[] args) {

        Printer mainPrinter = Printer.get(SubSystem.PRIMARY);
        Printer aux = Printer.get(SubSystem.AUXILIARY);
        Printer aux2 = Printer.get(SubSystem.AUXILIARY);
    }
}
