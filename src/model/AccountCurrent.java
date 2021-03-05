package model;

public class AccountCurrent extends Account {
	
	
	@Override
	public Double sacar(Double value) {
		return super.sacar(value) - 5;
	}
	
	@Override
	public Double transferir(Account account, Double value) {
		return super.transferir(account, value) - 5;
	}

}
