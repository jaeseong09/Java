package exam1105;

public class BankAccount {
 private String name;
 private String accountNumber;
 private int balance;
 
 public void BankAccount(String name,String accountNumber) {
	 this.name=name;
	 this.accountNumber=accountNumber;
	 this.balance=0;
 }
 
 public void BankAccount(String name,String accountNumber,int balance) {
	 this.name=name;
	 this.accountNumber=accountNumber;
	 this.balance=balance;
 }
 
 

 public String getName() {
	return name;
}

 public void setName(String name) {
	this.name = name;
 }

 public String getAccountNumber() {
	return accountNumber;
 }

 public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
 }

 public int getBalance() {
	return balance;
 }

 public void setBalance(int balance) {
	this.balance = balance;
 }

 public int withdrawal(int amount) {
	 
	 if(amount>balance) {
		 balance=amount;
	 }
	 else {
		 balance=amount-balance;
	 }
	 return balance;
 }
 
 public int deposit(int amount) {
	 balance=amount+balance;
	 return balance;
 }
}
