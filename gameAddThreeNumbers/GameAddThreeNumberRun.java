package gameAddThreeNumbers;

import java.util.Scanner;

public class GameAddThreeNumberRun {

	private static Scanner input;

	public static void main(String[] args) {
		int valueA = (int)(System.currentTimeMillis() % 10);		
		int valueB = (int)(System.currentTimeMillis() / 7 % 10);
		int valueC = (int)(System.currentTimeMillis() / 3 % 10);
		int sum =  valueA + valueB + valueC;
		
		input = new Scanner(System.in);
		
		System.out.println("A Game to add Three Numbers");
		System.out.println("***************************");
		System.out.printf("\t%d\t%d\t%d%n",  valueA, valueB, valueC);
		System.out.print("\nInput the sum of the above numbers: ");
		int answer = input.nextInt();
		
		if (sum == answer) {
			System.out.printf("%nAwesome! you’re right... %nThe sum of %d + %d + %d = %d%n", valueA, valueB, valueC, sum);
		}

		if (sum != answer) {
			System.out.printf("%nOops! Wrong answer...%nThe sum of %d + %d + %d = %d%n", valueA, valueB, valueC, sum);
		}
	}

}
