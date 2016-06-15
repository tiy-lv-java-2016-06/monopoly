/**
 * Created by vasantia on 6/14/16.
 */
public class Property {

    private String name;
    private double price;
    private double mortgage_Value;
    private String color;
    private boolean owned;

    public Property(String name, Double price, Double mortgage_Value, String color){
        this.name = name;
        this.price = price;
        this.mortgage_Value = mortgage_Value;
        this.color = color;
        owned = false;
    }

    public void setOwned(boolean owned) {
        this.owned = owned;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getMortgage_Value() {
        return mortgage_Value;
    }

    public String getColor() {
        return color;
    }

    public boolean isOwned() {
        return owned;
    }

}




