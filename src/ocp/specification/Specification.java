package ocp.specification;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
