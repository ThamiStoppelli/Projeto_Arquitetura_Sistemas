package Exercicios_1_e_2;

public class ProductSpecification {

    private String descripition;
    private double price;
    private String itemID;

    public ProductSpecification(String descripition, double price, String itemID) {
        this.descripition = descripition;
        this.price = price;
        this.itemID = itemID;
    }
    public double getPrice() {
        return this.price;
    }
}
