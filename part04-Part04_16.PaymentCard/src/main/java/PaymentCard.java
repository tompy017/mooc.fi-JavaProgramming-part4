
/**
 *
 * @author tom
 */
public class PaymentCard {
    
    private double balance;

    //Constructor
    public PaymentCard(double startingBalance) {
        this.balance = startingBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String toString() {
        String str = "The card has a balance of " + getBalance() + " euros";
        return str;
    }
    
    public void eatAffordably() {
        if (this.balance >= 2.6) {
            this.balance -= 2.6;
        }
    }
    
    public void eatHeartily() {
        if (this.balance >= 4.6) {
            this.balance -= 4.6;
        }
    }
    
    public void addMoney(double amount) {
        // only positive deposits
        if (amount > 0) {
            if (this.balance + amount > 150) {           // max balance of 150
                this.balance = 150;
            } else {
                this.balance += amount;
            }
        }
    }  
}
