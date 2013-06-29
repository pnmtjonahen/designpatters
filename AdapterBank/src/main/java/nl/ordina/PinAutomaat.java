package nl.tjonahen;

public class PinAutomaat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bepaalSaldo( new FIRABank());
		
		bepaalSaldo( new FortisBankAdapter());
		
	}
	
	private static void bepaalSaldo(IBank bank) {
		System.out.println("Mijn saldo is:" + bank.saldo("5521208"));
	}
	
	

}
