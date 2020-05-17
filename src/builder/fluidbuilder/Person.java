package builder.fluidbuilder;

public class Person {

    public String name;
    public String postition;

    @Override
    public String toString() {
        return "Person{" +
        "name='" + name + '\'' +
            ", position= '" + postition + '\'' +
            '}';
    }

    static class PersonBuilder<SELF extends PersonBuilder<SELF>> {
        protected Person person = new Person();
        // 1st iteration: doesnot return a employeebuilder , thus cannot be used in inheritance
        public SELF withName(String name) {
            person.name = name;
          //  return (SELF) this;// unchecked cast -- absolutely valid since a class extends SELF
            return self();
        }
        public Person build() {
            return person;
        }
        // this is done to override the behaviour in overriden class
        protected SELF self() {
            return (SELF) this;
        }
    }
    static class EmployeBuilder extends PersonBuilder<EmployeBuilder> {
        public EmployeBuilder worksAt(String position) {
            person.postition = position;
            return self(); // entertains fluidity amongst builders
        }

        @Override
        protected EmployeBuilder self() {
            return this;
        }
    }
}
