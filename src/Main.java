/**
 * Created by Nigel on 6/14/16.
 */
public class Main {

    public static void Main(String[] args) {

        Player player = new Player("Nigel", "Moose");
        Property property = new Property("Nigel", 100, 2500, "Blue");
        Chance chance = new Chance("Happy Card", "This car is super happy and it smells nice!");

        System.out.println("Happy day");
        property.isOwned());
    }
}

