/**
 * Created by vasantia on 6/14/16.
 */
public class Player {

    private String name;
    private double money;
    private String token;

    public Player(String name, String token){
        this.name = name;
        this.token = token;
        money = 1500;
    }

    public void setMoney(double money){
        this.money = money;
    }

    public String getName(){
        return name;
    }

    public String getToken(){
        return token;
    }

    public double getMoney(){
        return money;
    }

    public double payMoney(double money) {
        this.money -= money;
        return this.money;
    }
    public double addMoney(double money) {
        this.money += money;
        return this.money;
    }
}