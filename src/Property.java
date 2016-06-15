/**
 * Created by EddyJ on 6/14/16.
 */
public class Property {
    private String name;
    private int price;
    private int mortgagePrice;
    private String color;
    private Boolean owned;

    public Property(String name, int price, int mortgagePrice, String color){
        this.name = name;
        this.price = price;
        this.mortgagePrice = mortgagePrice;
        this.color = color;
        this.owned = false;
    }

    public void setOwned(Boolean owned){
        this.owned = owned;
    }

    public String getName(){
        return this.name;
    }

    public int getPrice(){
        return this.price;
    }

    public int getMortgagePrice(){
        return this.mortgagePrice;
    }

    public String getColor(){
        return this.color;
    }

    public Boolean getOwned(){
        return this.owned;
    }

}
