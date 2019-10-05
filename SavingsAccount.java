/* Denny To
 * CSCI 1302
 * 80183
 * Inheritance
 * Activity
 */

package BankAccount;

public class SavingsAccount extends BankAccount{
	
	private boolean active;

	public SavingsAccount(double balance) {
		super(balance);
		System.out.println("New Savings Account");
		if (balance < 25) { active = false;} 
		else { active = true; }
	}
	
	public void deposit(double deposit) {
		super.deposit(deposit);
		if (getBalance() >= 25) { active = true;}
	}
	
	public void withdraw(double withdraw) {
		if (getBalance() >= 25) {
			active = true;
			setBalance(getBalance() - withdraw);
			System.out.println("Withdrew: " + withdraw);}
		if (getBalance() < 25) { active = false;
			System.out.println("Account Deactivated." + "\n$25 Minimum Balance for withdrawals.");}
	}
	
	public String toString () {
		return "Savings Account Balance: " + getBalance() + "\nAccount Active: " + active + "\n";
	}
}
