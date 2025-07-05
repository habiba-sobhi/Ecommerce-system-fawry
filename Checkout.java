import java.util.List;

public class Checkout {
    
    public void processCheckout(Customer customer, Cart cart) {
        // Validate cart isn't empty
        if (cart.isEmpty()) {
            System.out.println("Error: Your cart is empty!");
            return;
        }

        // Check if its expired or out of stock products
        for (CartItem item : cart.getItems()) {
            Product p = item.getProduct();
            if (p.doesExpire() && p.getQuantity() < 0) {
                System.out.println("Error: " + p.getName() + " is expired/out of stock");
                return;
            }
        }

        // Calculate totals
        double subtotal = cart.getSubtotal();
        List<Product> shippableProducts = cart.getShippableProducts();
        double shippingFee = shippableProducts.size() * 50; 
        double total = subtotal + shippingFee;

        // Verify customer balance
        if (!customer.canAfford(total)) {
            System.out.println("Error: Insufficient balance");
            return;
        }

        // Process payment
        customer.deductBalance(total);
        
        // Print receiptt
        printReceipt(customer, cart, subtotal, shippingFee, total);

        
        // Print shipping notice (if needed)
        if (!shippableProducts.isEmpty()) {
            printShippingNotice(shippableProducts);
        }
    }

    private void printReceipt(Customer customer, Cart cart, double subtotal, double shippingFee, double total) {
    System.out.println("\n=== RECEIPT ===");
    System.out.printf("Customer: %s\n", customer.getName()); // Print customer's name
    for (CartItem item : cart.getItems()) {
        System.out.printf("%d x %s: EGP %.2f\n", 
            item.getQuantity(), 
            item.getProduct().getName(), 
            item.getProduct().getPrice() * item.getQuantity());
    }
    System.out.println("---------------");
    System.out.printf("Subtotal: EGP %.2f\n", subtotal);
    System.out.printf("Shipping: EGP %.2f\n", shippingFee);
    System.out.printf("Total: EGP %.2f\n", total);
}



private void printShippingNotice(List<Product> shippableProducts) {
    System.out.println("\n** Shipment Notice **");
    double totalWeight = 0;
    for (Product p : shippableProducts) {
        String weightStr = String.format("%.1fkg", p.getWeight());
        System.out.printf("%s %s\n", p.getName(), weightStr);
        totalWeight += p.getWeight();
    }
    System.out.printf("Total package weight: %.1fkg\n", totalWeight);
}
}
