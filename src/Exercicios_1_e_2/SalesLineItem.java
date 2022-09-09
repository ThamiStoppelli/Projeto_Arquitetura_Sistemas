package Exercicios_1_e_2;

public class SalesLineItem {
   private int quantity = 0;

   public SalesLineItem(int quantity) {
        this.quantity = quantity;
   }

   public int getQuantity() {
       return this.quantity;
   }

   public void setQuantity(int quantity) {
       this.quantity = quantity;
   }
   public double getSubtotal(ProductSpecification productSpecification) {
       return this.quantity * productSpecification.getPrice();
   }
}
