package dip;
/**
 * Dependency Injection Principle -- not used in this class
 * A : High level module should not depend on low-level module
 * Both should depend on Abstraction
 *
 */

public class DependencyInjectionPrinciple {
}

// low-level model
enum RelationShip{
    PARENT,
    CHILD,
    SIBLING
}

class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

}
// low - level model
class Relationships {

    //private List<Triplet<Person, Relationships, Person>> relations = new ArrayList<>();
    /*
    public List<Triplet<Person, Relationships, Person>> getRelations() {
        return relations;
    }

    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, Relationship.PARENT, child));
        relations.add(new Triplet<>(child, Relationship.CHILD, parent));

    }
     */
}
// high-level : since impl operations on Relationship
class Research{
    public Research(RelationShip relationShips) {
      /*
      List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
      relations.stream()
      .filter(x -> x.getValue0().name.equals("John) &&
                x.getValue1() == Relationship.PARENT)
                .foreach(ch -> System.out.println(
                "John has a child called " + ch.getValue2().name
                ))
       */
    }
}

