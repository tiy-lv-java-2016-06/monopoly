/**
 * Created by vasantia on 6/14/16.
 */
public class incomeTax {

    private double flatTax;
    private double percentTax;
    private double bankroll;

    public incomeTax(double bankroll) {
        flatTax = 200;
        percentTax = 0.10;
        this.bankroll = bankroll;
    }
    public void setFlatTax(double flatTax){
        this.flatTax = flatTax;
    }
    public void setPercentTax(double percentTax) {
        this.percentTax = percentTax;
    }
    public double getFlatTax(){
        return flatTax;
    }
    public double getPercentTax() {
        return percentTax;
    }
    public double getBankroll(){
        return bankroll;
    }
    public double chooseFlatTax(double flatTax) {
        this.flatTax += bankroll;
        return this.bankroll;
    }
    public double choosePercentTax(double percentTax) {
        this.percentTax = bankroll*percentTax + bankroll;
        return this.bankroll;
    }
}



