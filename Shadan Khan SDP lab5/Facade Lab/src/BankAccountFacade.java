
public class BankAccountFacade {

	private int accountNumber;
	private int securityCode;
	// define objects that we need to connect to this class
	private WelcomeToBank welcome;
	private SecurityCodeCheck security;
	private FundsCheck funds;
	private AccountNumberCheck account;

	public BankAccountFacade(int newAcctNum, int newSecCode) {
		accountNumber = newAcctNum;
		securityCode = newSecCode;
		welcome = new WelcomeToBank();
		security = new SecurityCodeCheck();
		funds = new FundsCheck();
		account = new AccountNumberCheck();

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void withdrawCash(double cashToGet) {

		if (account.accountActive(accountNumber) && funds.haveEnoughMoney(cashToGet)
				&& security.isCodeCorrect(securityCode)) {
			
					funds.decreaseCashInAccount(cashToGet);
			System.out.println("Transaction is complete!");
		} else
			System.out.println("Transaction failed");

	}

	public void depositCash(double cashToDeposit) {


		if (account.accountActive(accountNumber) && security.isCodeCorrect(securityCode)) {

			funds.increaseCashInAccount(cashToDeposit);
			System.out.println("Transaction is complete!");
		} else
			System.out.println("Transaction failed");

	}

}
