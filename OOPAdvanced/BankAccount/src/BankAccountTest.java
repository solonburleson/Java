import com.bankacct.*;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount acct1 = new BankAccount();
		System.out.println(acct1.getChecking());
		System.out.println(acct1.getSavings());
		acct1.deposit(1000.00, "checking");
		acct1.withdraw(2000.00, "savings");
		acct1.withdraw(500.00, "checking");
		acct1.acctTotal();
	}

}
