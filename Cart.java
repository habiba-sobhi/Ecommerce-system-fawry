import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        if (quantity > product.getQuantity()) {
            System.out.println("Error: Not enough " + product.getName() + " in stock");
            return;
        }
        items.add(new CartItem(product, quantity));
        product.reduceQuantity(quantity);
    }

    public double getSubtotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }

    public List<Product> getShippableProducts() {
        List<Product> shippable = new ArrayList<>();
        for (CartItem item : items) {
            if (item.getProduct().needsShipping()) {
                shippable.add(item.getProduct());
            }
        }
        return shippable;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
    
    public List<CartItem> getItems() {
        return items;
    }
}
