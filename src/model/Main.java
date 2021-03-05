package model;



public class Main {

	public static void main(String[] args) {

		Client miguel = new Client();
		miguel.setId(1L);
		miguel.setName("Miguel Renan");
		miguel.setEmail("seucuca@gmail.com");
		miguel.setPhone("242424242424");
		
		Client renan = new Client();
		renan.setId(1L);
		renan.setName("Renan Klinsmann");
		renan.setEmail("meup@gmail.com");
		renan.setPhone("0000000000");
		
		Account accountRenan = new Account();
		accountRenan.setId(1L);
		accountRenan.setNumber("0001-x");
		accountRenan.setAgency("0001");
		accountRenan.setClient(renan);
		accountRenan.setBalance(1500.00);
	
		
		Account accountMiguel = new Account();
		accountMiguel.setId(1L);
		accountMiguel.setNumber("0002-x");
		accountMiguel.setAgency("0002");
		accountMiguel.setClient(miguel);
		accountMiguel.setBalance(200.00);
		
		AccountCurrent accountCurrentMiguel = new AccountCurrent();
		accountCurrentMiguel.setId(1L);
		accountCurrentMiguel.setNumber("0001-x");
		accountCurrentMiguel.setAgency("0001");
		accountCurrentMiguel.setClient(miguel);
		accountCurrentMiguel.setBalance(800.00);
	
		
		AccountCurrent accountCurrentRenan = new AccountCurrent();
		accountCurrentRenan.setId(1L);
		accountCurrentRenan.setNumber("0002-x");
		accountCurrentRenan.setAgency("0002");
		accountCurrentRenan.setClient(renan);
		accountCurrentRenan.setBalance(280.00);
		
		
		System.out.println(accountCurrentMiguel.transferir(accountCurrentRenan, 100.00));
		System.out.println(accountCurrentRenan.getTransactions());
		
		System.out.println(accountCurrentMiguel.sacar(100.00));
		System.out.println(accountCurrentMiguel.getTransactions());
		
		System.out.println(accountCurrentMiguel.depositar(200.00));
		System.out.println(accountCurrentMiguel.getTransactions());
		
	}

}
