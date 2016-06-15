/**
 * Created by Nigel on 6/14/16.
 */
public class Player {
    private String name;
    public int money;
    private String token;

    public Player(String name, String token){
        money = 1500;
        this.name = name;
        this.token = token;
    }

    public static int bePoor(int sentMoney){
        this.money = this.money - sentMoney;
        return this.money;
    }

    public int beRich(int getMoney){
        this.money = this.money + getMoney;
        return this.money;
    }
}
