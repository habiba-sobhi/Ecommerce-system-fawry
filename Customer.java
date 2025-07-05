public class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Getter for the customer's name (Habiba Sobhi)
    public String getName() {
        return name;
    }

    public boolean canAfford(double amount) {
        return balance >= amount;
    }

    public void deductBalance(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
