import java.util.Random;

/**
 * Created by Nigel on 6/14/16.
 */
public class Dice {
    Property[] properties;
    public Dice(){
        properties = null;
    }
    public int roll(){
        Random diceRoll = new Random();
        int randomNum = diceRoll.nextInt((6 - 2) + 1);
        return randomNum;
    }

    public void property(int propertyPrice, Property propertyName){
        Player.bePoor(propertyPrice);
        properties[0] = propertyName;
    }
}
