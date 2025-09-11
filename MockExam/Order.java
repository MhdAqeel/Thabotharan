import java.util.ArrayList;
import java.util.List;

public class Order {
    private final Customer customer;
    private final LIst<OrderItem> items =new ArrayList<>();
    public Order (Customer customer){
        this.customer=customer;
    }

    public void addItem(Product p,int qty){
        items.add(new OrderItem (p , qty));
    }
    public double subtotal(){
        return items.stream().mapToDouble(OrderItem::LineTotal).sum();
    }
    public double discount()
    {
        return subtotal() * customer.getCard().discountRate();
    }

    public double total(){
        return subtotal() - discount();
    }

    public void printRicipt(){
        system.out.println("==== campus Cafe Recipt ====") ;
        system.out.println("Customer : "+customer.getName()+"{"+customer.getCard().getTier()+"}");
        system.out.println(------------------------------  );
        for (OrderItem item : items){
            Product p = item.getProduct();
            double line = item.LineTotal();
            system.out.printf("%-20s %2d x %6.2f = %6.2f\n",p.getName(),item.getQty(),p.getPrice(),line);
        }
        system.out.println(------------------------------  );
        system.out.printf("Subtotal : %7.2f\n",subtotal());
        system.out.printf("Discount : %7.2f\n",discount());
        system.out.printf("Total : %7.2f\n",total());
        system.out.println(==============================  );   
    }

    puublic void printKitchenPrepList(){
        system.out.println("==== Kitchen Prep List ====");
        for (OrderItem item : items){
            system.out.printf("item.KitchenLine()");
        }
        system.out.println(==============================  );
    }
}