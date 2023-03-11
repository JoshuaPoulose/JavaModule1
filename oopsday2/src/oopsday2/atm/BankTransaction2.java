package oopsday2.atm;

public class BankTransaction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(101,"joshua","savings",10000);
		Account a2=new Account(102,"megha","savings",20000);
		Account a3=new Account(103,"sreelakshmi","salary",30000);
		Account a4=new Account(104,"amina","salary",40000);
		Account a5=new Account(105,"anwar","pension",50000);
		
		BankofAmerica2 boa=new BankofAmerica2();
		boa.addAcccount(a1);
		boa.addAcccount(a2);
		boa.addAcccount(a3);
		boa.addAcccount(a4);
		boa.addAcccount(a5);
		
		System.out.println(boa.balance(103));
		double result=boa.deposit(100, 103);
		System.out.println(result);
		result=boa.withdraw(50, 103);
		System.out.println(result);
	}

}
