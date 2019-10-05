/* Denny To
 * CSCI 1302
 * 80183
 * Inheritance
 * Activity
 */

package BankAccount;

public class BankAccountDriver {

	public static void main(String[] args) {
		
		SavingsAccount account2 = new SavingsAccount(20);
		System.out.println(account2);
		
		account2.deposit(20);
		System.out.println(account2);
		
		account2.withdraw(25);
		System.out.println(account2);
		
		account2.withdraw(10);
		System.out.println(account2);
		
		account2.deposit(20);
		System.out.println(account2);
		
		account2.withdraw(10);
		System.out.println(account2);
		
		account2.deposit(15);
		System.out.println(account2);
		
		account2.withdraw(20);
		System.out.println(account2);
		
		account2.withdraw(5);
		System.out.println(account2);
		
		SavingsAccount account1 = new SavingsAccount(24);
		System.out.println(account1);
		
		account1.withdraw(4);
		System.out.println(account1);
	}

}
