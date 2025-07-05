public class main {
    public static void main(String[] args) {

        Product cheese = new Product("Cheese", 200, 10, true, true, 0.4);
        Product biscuits = new Product("Biscuits", 150, 5, true, true, 0.7);
        Product tv = new Product("TV", 10000, 2, false, true, 15.0);
        Product scratchCard = new Product("Scratch Card", 50, 100, false, false, 0.0);

        Customer customer = new Customer("Habiba Sobhi", 15000);

        // Create cart and add items
        Cart cart = new Cart();
        cart.addProduct(cheese, 2);
        cart.addProduct(biscuits, 1);
        cart.addProduct(tv, 1);
        cart.addProduct(scratchCard, 3);

        // Process checkout
        Checkout checkout = new Checkout();
        checkout.processCheckout(customer, cart);

        // Print final balance
      System.out.printf("\nCustomer balance after payment: EGP %.2f\n", customer.getBalance());
    }
}
