/**
 * Created by Nigel on 6/14/16.
 */
public class Property {
    private String name;
    private int price;
    private int mortgageValue;
    private String color;
    private boolean owned;

    public Property(String name, int price, int mortgageValue, String color){
        this.name = name;
        this.price = price;
        this.mortgageValue = mortgageValue;
        this.color = color;
        owned = false;
    }

    public boolean isOwned(){
        return this.owned;
    }
}
