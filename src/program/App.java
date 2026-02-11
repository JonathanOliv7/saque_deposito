package program;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import model.entitties.Account;
import model.exception.LimitWithdrawException;

public class App {

	public static void main(String[] args) {
	
		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter account data: ");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account( number, holder, balance, withdrawLimit);
			System.out.println();
			System.out.print("Enter amount of withdraw: ");
			Double amount = sc.nextDouble();
			
			account.withdraw(amount);
			System.out.println(String.format("%.2f", account.getBalance()));
			sc.close();
		}
		catch(LimitWithdrawException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		} 
		catch(InputMismatchException e) {
			System.out.println("Invalid number: enter an integer" );
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
	}				
}

