public class Product {
    private String name;
    private double price;
    private int quantity;
    private boolean expires;
    private boolean needsShipping;
    private double weight;

    public Product(String name, double price, int quantity, 
                  boolean expires, boolean needsShipping, double weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expires = expires;
        this.needsShipping = needsShipping;
        this.weight = weight;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public boolean doesExpire() { return expires; }
    public boolean needsShipping() { return needsShipping; }
    public double getWeight() { return weight; }
    
    public void reduceQuantity(int amount) {
        quantity -= amount;
    }
}
