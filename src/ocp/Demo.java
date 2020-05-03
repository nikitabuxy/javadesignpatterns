package ocp;

import ocp.model.Color;
import ocp.model.Product;
import ocp.model.Size;
import ocp.specification.ColorSpecification;
import ocp.specification.MultipleSpecification;
import ocp.specification.SizeSpecification;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  OCP : Open Closed Principle using Specification design principle
 * OCP : Open for extensions but closed for modifications
 * @author Nikita Buxy
 */
public class Demo {

    public static void main(String args[]) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);

        List<Product> productList = Stream.of(apple, tree, house).collect(Collectors.toList());

        ProductFilter pf = new ProductFilter();
        System.out.println("Green products (old): ");
        pf.filterByColor(productList, Color.GREEN)
                .forEach(product -> System.out.println(" - " + product.name + " is green"));

        BetterProductFilter betterProductFilter = new BetterProductFilter();
        System.out.println("Green products (new): ");
        betterProductFilter.filter(productList, new ColorSpecification(Color.GREEN))
                .forEach(product -> System.out.println(" - " + product.name + " is green"));

        System.out.println("Blue and large products : ");
        betterProductFilter.filter(productList, new MultipleSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE)
        ))
        .forEach(product ->  System.out.println(" - " + product.name + " is large and blue"));

    }

}
