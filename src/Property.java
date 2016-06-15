/**
 * Created by AK on 6/14/16.
 */
public class Property {
    private String name;
    private int price;
    private int mortgageValue;
    private String color;
    private boolean owned;

    public Property(String name, int Price, int mortgageValue, String color) {
        this.name = name;
        this.price = price;
        this.mortgageValue = mortgageValue;
        this.color = color;
        this.owned = false;

    }

    public String getname() {
        return this.name;
    }

    public int getprice() {
        return this.price;
    }

    public int getmortgageValue() {
        return this.mortgageValue;
    }

    public String getcolor() {
        return this.color;
    }
    public void setOwned(boolean owned) {
        this.owned = owned;

    }
}





