public class TestOrder {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Alice", new LoyaltyCard(LoyaltyCard.Tier.GOLD));
        Customer cust2 = new Customer("Bob", new LoyaltyCard(LoyaltyCard.Tier.SILVER));
        Customer cust3 = new Customer("Charlie", new LoyaltyCard(LoyaltyCard.Tier.NONE));

        Product coffee = new Beverage("Coffee", 3.50, Size.MEDIUM ,false);
        Product sandwich = new Pastry("Sandwich", 5.00, true , true);
        Product cake = new Pastry("Cake", 4.00, false , false);

        Order order1 = new Order(cust1);
        order1.addItem(coffee, 2);
        order1.addItem(sandwich, 1);
        order1.printReceipt();
        order1.printKitchenPrepList();

        Order order2 = new Order(cust2);
        order2.addItem(cake, 3);
        order2.addItem(coffee, 1);
        order2.printReceipt();
        order2.printKitchenPrepList();

        Order order3 = new Order(cust3);
        order3.addItem(sandwich, 2);
        order3.addItem(cake, 1);
        order3.printReceipt();
        order3.printKitchenPrepList();
    }
}