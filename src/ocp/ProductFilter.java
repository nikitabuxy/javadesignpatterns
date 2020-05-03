package ocp;

import ocp.model.Color;
import ocp.model.Product;
import ocp.model.Size;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(product -> product.color == color);
    }
    /**
     *     OCP : Open for extensions but closed for modifications
      */
    public Stream<Product> filterBySize(List<Product> products, Size size ) {
        return products.stream().filter( product -> product.size == size);
    }

    public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) {
        return products.stream().filter(product -> product.size == size && product.color == color);
    }
}
