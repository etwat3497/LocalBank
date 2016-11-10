/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package localbank;

 import java.util.ArrayList;
 import java.util.Scanner;
  
 /**
  * A bank where accounts can be opened or closed and customers can 
  * make transactions.
  */
public class LocalBank {

	public static void main(String[] args) {
		Bank easySave = new Bank();
		Scanner input = new Scanner(System.in);
		String action, acctID;
		Double amt;
				
		/* display menu of choices */
		do {
			System.out.println("\nDeposit\\Withdrawal\\Check balance");
			System.out.println("Add an account\\Remove an account\\Modify an account");
			System.out.println("Quit\n");
			System.out.print("Enter choice: ");
			action = input.next();
			
			if (action.equalsIgnoreCase("A")) {
				easySave.addAccount();
			} else if (!action.equalsIgnoreCase("Q")) {
				System.out.print("Enter account ID: ");
				acctID = input.next();
				if (action.equalsIgnoreCase("D")) {
					System.out.print("Enter deposit amount: ");
					amt = input.nextDouble();
					easySave.transaction(1, acctID, amt);
				} else if (action.equalsIgnoreCase("W")) {
					System.out.print("Enter withdrawal amount: ");
					amt = input.nextDouble();
					easySave.transaction(2, acctID, amt);
				} else if (action.equalsIgnoreCase("C")) {
					easySave.checkBalance(acctID);
				} else if (action.equalsIgnoreCase("R")) {
					easySave.deleteAccount(acctID);
				} else if (action.equalsIgnoreCase("M")) {
					easySave.modifyAccount(acctID);
				}
			}
		} while (!action.equalsIgnoreCase("Q"));
	}
}
