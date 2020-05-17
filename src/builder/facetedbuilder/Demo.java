package builder.facetedbuilder;

/**
 * Faceted builder : multiple builder
 */
public class Demo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives().at("xyz road")
                        .in("ind")
                        .withPostCode("df123")
                .works().atCompany("al") // swiftly start the job builder
                        .asA("sw")
                        .earning(123)
                .build();
        System.out.println(person);
    }
}
