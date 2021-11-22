package Account;

import java.util.Scanner;

public class AccountTest {
    public int debit() {
        Scanner scanData = new Scanner(System.in);
	System.out.println("Enter your Account");
	int amountInput = scanData.nextInt();
	System.out.println("Enter Withdrawal Amount");
	int amount = scanData.nextInt();
	if (amountInput >= amount) {
	    int accountBalance = amountInput - amount;
	    System.out.println("The Remaining money in your account :" + accountBalance);
	} 
	else {
	    System.out.println("Debit amount exceeded to Account Balance");
	}
	int amountBl = amountInput - amount ;
	return amountBl;
    }
}
