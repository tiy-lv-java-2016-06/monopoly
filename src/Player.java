/**
 * Created by EddyJ on 6/14/16.
 */
public class Player {
    private String name;
    private int money;
    private String token;

    public Player(String name, String token){
        this.name = name;
        this.token = token;
        this.money = 1500;
    }

    public int payMoney(int payMoney){
        this.money = this.money - payMoney;
        return this.money;
    }

    public int addMoney(int addMoney){
        this.money = this.money + addMoney;
        return this.money;
    }

    public String getName(){
        return this.name;
    }
    public int getMoney(){
        return this.money;
    }
    public String getToken(){
        return this.token;
    }
}


