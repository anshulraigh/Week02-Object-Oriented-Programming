package ecommerceplatform;

public class Electronics extends Product implements Taxable {
    private double discountPercentage;

    public Electronics(int productId, String name, double price, double discountPercentage) {
        super(productId, name, price);
        this.discountPercentage = discountPercentage;
    }

    // Implement abstract method for calculating discount
    @Override
    public double calculateDiscount() {
        return getPrice() * discountPercentage / 100;
    }

    // Implement Taxable interface methods
    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax on electronics
    }

    @Override
    public String getTaxDetails() {
        return "Tax on Electronics: 18%";
    }
}
