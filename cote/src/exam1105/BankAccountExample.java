package exam1105;

import exam1020.BankAccount;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount account= new BankAccount("김자바","1234",0);
		BankAccount account2= new BankAccount("이자바","1234",0);
		
		int currenbalance=account.deposit(10000);
		System.out.println(currenbalance);
		System.out.println(account.getBalance());
	}

}
