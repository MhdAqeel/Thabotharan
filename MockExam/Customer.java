public class Customer{
    private final String name ;
    private final LoyaltyCard card;

    public Customer(String name ,LoyaltyCard card){
        this.name = name;
        this.card = card;
    }

    public String getName(){
        return name;
    }
    public LoyaltyCard getCard(){
        return card;
    }
}