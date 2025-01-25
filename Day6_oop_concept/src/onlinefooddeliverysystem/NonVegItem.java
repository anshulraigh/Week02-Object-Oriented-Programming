package onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private double discountPercentage;
    private static final double ADDITIONAL_CHARGE = 50.0; // Fixed additional charge for non-veg items

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + ADDITIONAL_CHARGE;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        this.discountPercentage = discountPercentage;
        System.out.println("Discount applied: " + discountPercentage + "%");
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discountPercentage + "%";
    }
}
