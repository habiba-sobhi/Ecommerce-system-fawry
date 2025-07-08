
# E-Commerce Checkout System

## Overview
This is a simple Java-based e-commerce checkout system I built to manage products, shopping carts, and customer orders. It handles product inventory management, calculates shipping costs, and processes customer payments. The system focuses on thorough receipt generation and shipment notifications.

## Features
- Product management with details like name, price, quantity, expiration status, and shipping requirements
- Shopping cart functionality to add/remove products
- Automated checkout process with receipt generation
- Shipping cost calculations based on product weight
- Customer balance validation
- Proper error handling for out-of-stock items and insufficient funds

## Technologies Used
- Java (Core OOP concepts)
- VS Code (development environment)
- Git/GitHub (version control)

## How to Run
1. Make sure you have Java JDK installed
2. Clone this repository
3. Compile all Java files:
   ```bash
   javac *.java
   ```
4. Run the program:
   ```bash
   java Main
   ```

When you run the program, you'll see something like:

```
=== RECEIPT ===
Customer: Habiba Sobhi
2 x Cheese: EGP 400.00
1 x Biscuits: EGP 150.00
1 x TV: EGP 10000.00
3 x Scratch Card: EGP 150.00
---------------
Subtotal: EGP 10700.00
Shipping: EGP 150.00
Total: EGP 10850.00

** Shipment Notice **
Cheese 0.4kg
Biscuits 0.7kg
TV 15.0kg
Total package weight: 16.1kg

Customer balance after payment: EGP 4150.00
```

Working on this project helped me:
- Practice core Java OOP principles
- Better understand class relationships
- Implement proper error handling
- Create clear output formatting
- Manage inventory tracking

Future versions could include:
- Database persistence for products/customers
- GUI interface
- Discount/promotion system
- More detailed shipping options

