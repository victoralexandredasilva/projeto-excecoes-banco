package application;

import java.util.Scanner;

import model.entities.Account;

public class Program {
	public static void main(String[] args) {
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
		
		System.out.println(acc);
		sc.close();
	}
}
