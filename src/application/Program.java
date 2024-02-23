package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account data:");
		System.out.print("Number:  ");
		Integer numberAccount = sc.nextInt();
		System.out.print("Holder:  ");
		sc.nextLine();
		String holderAccount = sc.nextLine();
		System.out.print("Initial balance:  ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit:  ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(numberAccount, holderAccount, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw:  ");
		Double amount = sc.nextDouble();
		acc.withdraw(amount);
		
		System.out.println(acc);
		sc.close();
		} 
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Ocorreu um erro inesperado!");
		}

	}
}
