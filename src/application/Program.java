package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int numberAccount = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit?(y/n)");
		char resp = sc.next().charAt(0);
		Conta conta;
		
		if(resp == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(numberAccount, holder, initialDeposit);
		}
		else {
			conta = new Conta(numberAccount, holder);
		}
		System.out.println();
		System.out.println("Account data: " + conta);
		
		System.out.println();
		System.out.println("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Updated account data: " + conta);
		
		System.out.println();
		System.out.println("Enter withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.withdraw(withdrawValue);
		System.out.println("Updated account data: " + conta);
		System.out.println("Foi submetido no git!!!!");
		sc.close();
	}

}
