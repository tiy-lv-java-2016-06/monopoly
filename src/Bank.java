import javax.swing.text.StyledEditorKit;

/**
 * Created by EddyJ on 6/14/16.
 */
public class Bank {
    private int money;

    public Bank(){
        this.money = 15140;
    }
    public int deposit(int deposit){
        this.money = this.money + deposit;
        return this.money;
    }

    public int withdrawl(int withdrawl){
        this.money = this.money - withdrawl;
        return  this.money;
    }
}
