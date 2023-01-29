
public class TestBankFacade {

	public static void main(String[] args){

		//type code to withdraw money and delete money using the facade class
		BankAccountFacade bank = new BankAccountFacade(12345678, 1234);

		bank.withdrawCash(50);
		bank.depositCash(30);
		
	}

}

