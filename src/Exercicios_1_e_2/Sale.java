package Exercicios_1_e_2;

import java.util.ArrayList;

public class Sale {
    private String date;
    private String time;

    public Sale(String date, String time) {
        this.date = date;
        this.time = time;
    }
    public double getTotal(ArrayList<SalesLineItem> salesLineItems, ArrayList<ProductSpecification> productSpecifications) {
        double total = 0;
        for (int i = 0; i < salesLineItems.size(); i++) {
            total += salesLineItems.get(i).getSubtotal(productSpecifications.get(i));
        }
        return total;
    }
}
