package builder.fluidbuilder;
/**
 * If you want ot have a flunt builder interface ,you need to have fluid generic interface of Java
 * Fluid builder : user when single builder is required
 */
public class PersonDemo {
        public static void main(String[] args) {
            Person.EmployeBuilder pb = new Person.EmployeBuilder();
            Person nikita = pb.withName("nikita").worksAt("Al").build();
        }
}
