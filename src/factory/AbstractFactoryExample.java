package factory;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AbstractFactoryExample {
}

interface HotDrink{
    void consume();
}

class Tea implements HotDrink{

    @Override
    public void consume() {
        System.out.println("This tea is nice!!");
    }
}

class Coffee implements HotDrink{

    @Override
    public void consume() {
        System.out.println("This coffee is nice!! ");
    }
}

interface HotDrinkFactory{
    HotDrink prepare(int amount) ;
}

class TeaFactory implements HotDrinkFactory{

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Tea Process description!!!... ");
        return new Tea();
    }
}

class CoffeeFactory implements HotDrinkFactory {

    @Override
    public HotDrink prepare(int amount) {
        System.out.println("Coffee Process description!!!... ");
        return new Coffee();
    }
}


class HotDrinkMachine{

    private List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

}
