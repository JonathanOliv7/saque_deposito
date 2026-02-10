package program;

import java.util.Scanner;

import model.entitties.Account;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account( number, holder, balance, withdrawLimit);
		
		}
		catch(RuntimeException e) {
			
		}
		
		
		
		sc.close();
	}
}
