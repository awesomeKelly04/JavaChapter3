package account;

import java.util.Scanner;

public class AccountTest {

	private static Scanner collect;
	private static Account fAccount;

	public static void main(String[] args) {
		fAccount = new Account();
		
		collect = new Scanner(System.in);
		
		System.out.print("Enter your bvn number: ");
		double bvn = collect.nextDouble();
		fAccount.setBvn(bvn);
		System.out.printf("Your bvn number is %.2f%n", fAccount.getBvn());
		
		System.out.print("Enter your credit amount: ");
		double result = collect.nextDouble();
		System.out.printf("Your balance is %.2f%n ", fAccount.credit(result));	
		System.out.printf("Your balance is %.2f%n ", fAccount.getBalance());	

	}
	
	

}
