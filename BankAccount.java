/* Denny To
 * CSCI 1302
 * 80183
 * Inheritance
 * Activity
 */

package BankAccount;

public class BankAccount {
	
	private double balance;
	private double deposit;
	private double withdraw;
	
	public double getBalance() {return balance;}
	public void setBalance(double balance) {this.balance = balance;}

	public double getDeposit() {return deposit;}
	public void setDeposit(double deposit) {this.deposit = deposit;}

	public double getWithdraw() {return withdraw;}
	public void setWithdraw(double withdraw) {this.withdraw = withdraw;}

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double deposit) {
		this.deposit = deposit;
		balance += deposit;
		System.out.println("Deposited: " + deposit);
	}
	
	public void withdraw(double withdraw) {
		this.withdraw = withdraw;
		balance -= withdraw;
		System.out.println("Withdrew: " + withdraw);
	}
}
