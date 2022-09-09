import Exercicios_1_e_2.Sale;
import Exercicios_1_e_2.ProductSpecification;
import Exercicios_1_e_2.SalesLineItem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductSpecification banana = new ProductSpecification("banana", 1.0, "1");
        ProductSpecification abacaxi = new ProductSpecification("abacaxi", 2.0, "1");
        ProductSpecification jambo = new ProductSpecification("jambo", 3.0, "1");
        SalesLineItem bananaLineItem = new SalesLineItem(3);
        SalesLineItem abacaxiLineItem = new SalesLineItem(4);
        SalesLineItem jamboLineItem = new SalesLineItem(1);
        ArrayList<SalesLineItem> salesLineItems = new ArrayList<>();
        salesLineItems.add(bananaLineItem);
        salesLineItems.add(abacaxiLineItem);
        salesLineItems.add(jamboLineItem);
        ArrayList<ProductSpecification> productSpecifications = new ArrayList<>();
        productSpecifications.add(banana);
        productSpecifications.add(abacaxi);
        productSpecifications.add(jambo);
        Sale total = new Sale("12/12/2012", "10:32:11");
        System.out.println(total.getTotal(salesLineItems, productSpecifications));

    }
}
