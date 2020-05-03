package ocp;

import ocp.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public interface FIlter<T> {

    Stream<T> filter(List<T> items, Specification<T> spec);
}
