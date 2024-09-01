class BankAccount{
    private double balance;
    
    public BankAccount(double initialBalance){
        if(initialBalance>0){
            this.balance = initialBalance;
        }
        else{
            System.out.println("Initial balance must be positive");
            this.balance = 0;
        }
    }
    
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: Rs."+amount);
        }
        
        else{
            System.out.println("Deposited amount must be positive");
        }
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: Rs." + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal amount exceeds the current balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    
    public void displayBalance(){
        System.out.println("Current Balance: Rs."+balance);
    }
    
}
public class Main
{
	public static void main(String[] args) {
	    BankAccount ba = new BankAccount(500.00);
	    ba.displayBalance();
	    
	    ba.deposit(600.00);
	    ba.displayBalance();
	    
	    ba.withdraw(400.00);
	    ba.displayBalance();
	}
}
