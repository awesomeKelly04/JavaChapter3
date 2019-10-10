package removingDuplicatedCodeInMethodmain;

import java.util.Scanner;

public class AccountTest {

	private static Scanner input;

	public static void main(String[] args) {
		 
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53); 
		 
		// calling method to display initial balance of each object
		displayAccount(account1);
		displayAccount(account2);
		
		input = new Scanner(System.in);
		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble(); // obtain user input
		
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount); // add to account1’s balance
		 
		// calling method to display balances
		displayAccount(account1);
		displayAccount(account2);
		 
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);		 
		account2.deposit(depositAmount); // add to account2 balance
		 
		// calling method to display balances
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter withdrawal amount for account1: "); 
		double withdrawAmount = input.nextDouble(); 
		System.out.printf("%nwithdrawing %.2f from account1%n%n%s%n%n", withdrawAmount, account1.withdraw(withdrawAmount, account1.getBalance()));
		
		
		// calling method to display balances
		displayAccount(account1);
	}
	
	public static void displayAccount(Account accountToDisplay) {
		// display balances
		 System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance()); 
	}

}
