package lab1b;

public class Banker {
	
	private static Banker single_instance = null;
	private Banker () { }
	public static Banker getInstance() {
		if(single_instance == null) {
			single_instance = new Banker();
		}
		return single_instance;
	}
	public void log(String balance, String deposit, String withdraw) {
		System.out.println("Balance: "+balance);
		System.out.println("Deposit: "+deposit);
		System.out.println("Withdraw: "+withdraw);
	}
}
