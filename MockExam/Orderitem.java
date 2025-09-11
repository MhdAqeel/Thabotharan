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
    public int grtQuantity(){
        return quantity;
    }

    public double lineTotal (){
        return product.price() * quantity;
    }
    public String kitchenLine (){
        //polimorphic call to prepote ()
        return String.format("%d %s -> %s",quantity,product,getName(),product.prepNote());
    }
}
