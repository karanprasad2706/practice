package abstraction;

public class BankCall extends Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankA a = new BankA();
		a.getBalance();
		
		BankB b = new BankB();
		b.getBalance();
		
		BankC c = new BankC();
		c.getBalance();
		
	}

	@Override
	void getBalance() {
		// TODO Auto-generated method stub
		
	}

}
