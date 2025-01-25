package ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create a list to store products
        List<Product> products = new ArrayList<>();

        // Add Electronics product
        Electronics electronics = new Electronics(101, "Laptop", 50000, 10); // 10% discount
        products.add(electronics);

        // Add Clothing product
        Clothing clothing = new Clothing(102, "T-Shirt", 1000, 15); // 15% discount
        products.add(clothing);

        // Add Groceries product
        Groceries groceries = new Groceries(103, "Rice", 200, 5); // 5% discount
        products.add(groceries);

        // Process products using polymorphism
        for (Product product : products) {
            product.displayDetails();
            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
                System.out.println(((Taxable) product).getTaxDetails());
            }
            double finalPrice = product.calculateFinalPrice(tax);
            System.out.println("Final Price (after tax and discount): " + finalPrice);
            System.out.println("-------------------------");
        }
    }
}
