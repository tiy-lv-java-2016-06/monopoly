/**
 * Created by AK on 6/14/16.
 */
public class Player {
   private int name;
   private int money;
   private String token;

    public Player(int name, int money, String token) {
        this.name = name;
        this.token = token;
        this.money = 1500;
    }
    public int payMoney(int spendMoney) {
        this.money = this.money - spendMoney;
        return this.money;

    }
    public int receiveMoney(int getMoney) {
        this.money = this.money + getMoney;
        return this.money;
    }

    public int name() { return this.name; }
    public int money() { return this.money; }
    public String token() {return this.token;}



}



