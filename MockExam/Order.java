import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Customer customer;
    private final List<OrderItem> items = new ArrayList<>();
    
    public Order(Customer customer){
        this.customer = customer;
    }

    public void addItem(Product p, int qty){
        items.add(new OrderItem(p, qty));
    }
    
    public double subtotal(){
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.lineTotal();
        }
        return total;
    }
    
    public double discount() {
        return subtotal() * customer.getCard().discountRate();
    }

    public double total(){
        return subtotal() - discount();
    }

    public void printReceipt(){
        System.out.println("==== Campus Cafe Receipt ====");
        System.out.println("Customer : " + customer.getName() + " {" + customer.getCard().getTier() + "}");
        System.out.println("------------------------------");
        for (OrderItem item : items){
            Product p = item.getProduct();
            double line = item.lineTotal();
            System.out.printf("%-25s %2d x %6.2f = %6.2f\n", p.getName(), item.getQuantity(), p.price(), line);
        }
        System.out.println("------------------------------");
        System.out.printf("Subtotal : %7.2f\n", subtotal());
        System.out.printf("Discount : %7.2f\n", discount());
        System.out.printf("Total    : %7.2f\n", total());
        System.out.println("==============================");
    }

    public void printKitchenPrepList(){
        System.out.println("==== Kitchen Prep List ====");
        for (OrderItem item : items){
            System.out.println(item.kitchenLine());
        }
        System.out.println("==============================");
    }
}