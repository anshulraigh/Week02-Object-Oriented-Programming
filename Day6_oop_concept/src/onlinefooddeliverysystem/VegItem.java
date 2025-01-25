package onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {
    private double discountPercentage;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
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
