// OnlineFoodDeliverySystem.java
package onlinefooddeliverysystem;

public class Main {
    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 250.0, 2);
        vegItem.getItemDetails();
        ((Discountable) vegItem).applyDiscount(10.0);
        System.out.println(((Discountable) vegItem).getDiscountDetails());
        System.out.println();

        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 350.0, 1);
        nonVegItem.getItemDetails();
        ((Discountable) nonVegItem).applyDiscount(15.0);
        System.out.println(((Discountable) nonVegItem).getDiscountDetails());
    }
}
