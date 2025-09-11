public class LoyaltyCard{
    public enum Tier { NONE ,SILVER , GOLD}
    private final Tier tier;
    public LoyaltyCard (Tier tier){
        this.tier=tier;
    }

    public Tier getTier(){
        return tier;
    }

    public double discountRate(){
        switch (tier){
            case SILVER : return 0.05;
            case GOLD : return 0.10;
            default : return 0.00;
        }
    }

    @Override 
    public String toString () {
        return "LoyaltyCard( tier = "+tier + ")"; 
    }
}