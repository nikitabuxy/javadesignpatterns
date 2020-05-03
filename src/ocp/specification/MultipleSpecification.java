package ocp.specification;

public class MultipleSpecification<T> implements Specification<T> {

    private Specification<T> one, two;

    public MultipleSpecification(Specification<T> colorSpecification, Specification<T> sizeSpecification) {
        this.one = colorSpecification;
        this.two = sizeSpecification;
    }

    @Override
    public boolean isSatisfied(T item) {
        return one.isSatisfied(item) && two.isSatisfied(item);
    }
}
