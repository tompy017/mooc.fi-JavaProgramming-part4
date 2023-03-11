
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mat = new Account("Matthews account", 1000.00);
        Account mine = new Account("My account", 0.00);
        
        //Withdraws 100.0 from Matthew's account
        mat.withdrawal(100.00);
        //Deposits 100.0 to "my account"
        mine.deposit(100.00);
        
        //Prints both the accounts
        System.out.println(mat);
        System.out.println(mine);
    }
}
