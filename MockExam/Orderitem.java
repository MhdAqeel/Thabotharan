public class OrderItem {
    private final Product product;
    private final int quantity;

    public OrderItem(Product product , int quantity){
        if (quantity <= 0 ) throw new IllegalArgumentException("quantity must be > 0");
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }

    public double lineTotal (){
        return product.price() * quantity;
    }
    public String kitchenLine (){
    return String.format("%d x %s -> %s", quantity, product.getName(), product.prepNote());
    }
}
