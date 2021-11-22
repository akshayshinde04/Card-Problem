package Account;

public class AccountDetails {
    public static void main(String[] args) {
	AccountTest account = new AccountTest();
	int debitAmount = account.debit();
	System.out.println("Account Balance :"+ debitAmount );
    }
}
