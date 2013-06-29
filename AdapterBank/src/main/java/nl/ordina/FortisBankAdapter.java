package nl.tjonahen;

public class FortisBankAdapter implements IBank {

	public long saldo(String rekeningNummer) {
		FortisBank bank = new FortisBank();
		Rekening rek = new Rekening();
		rek.setRekening(rekeningNummer);
		Saldo s = new Saldo();
		
		bank.bepaalSaldoVanRekening(rek, s);
		
		return s.getSaldo().longValue();
	}

}
