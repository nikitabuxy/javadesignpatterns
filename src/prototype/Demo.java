package prototype;

import java.util.Arrays;

/**
 *
 */
public class Demo {
    public static void main(String[] args) {
        Person john = new Person(new String[] {"John", "Smith"}, new Address("London road", 123));

        Person jane = john;
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;
    }
}

class Address {
    public String streetName;
    public int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}

class Person {
    public String [] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }
}