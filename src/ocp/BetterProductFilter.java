package ocp;

import ocp.model.Product;
import ocp.specification.Specification;

import java.util.List;
import java.util.stream.Stream;

public class BetterProductFilter implements FIlter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(spec::isSatisfied);
    }
}
