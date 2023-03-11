package oopsatm.menu;

//import oopsday3.atm.menu.Account;
//import oopsday3.atm.menu.BankofAmerica2;
import java.util.Scanner;

public class BankMenu {
	BankofAmerica2 boa=new BankofAmerica2();
	public BankMenu() {
		Account a1=new Account(101,"joshua","savings",10000);
		Account a2=new Account(102,"megha","savings",20000);
		Account a3=new Account(103,"sreelakshmi","salary",30000);
		Account a4=new Account(104,"amina","salary",40000);
		Account a5=new Account(105,"anwar","pension",50000);
		
		boa.addAcccount(a1);
		boa.addAcccount(a2);
		boa.addAcccount(a3);
		boa.addAcccount(a4);
		boa.addAcccount(a5);
	}
	public void menu() {
		Scanner scanner= new Scanner(System.in);
		int choice=0;
		loop:do {
			System.out.println("enter your choice 1->5");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
			{
//				boa.addAcccount(a1);
//				boa.addAcccount(a2);
//				boa.addAcccount(a3);
//				boa.addAcccount(a4);
//				boa.addAcccount(a5);
				System.out.println("enter account no: ");
				int actno=scanner.nextInt();
				boa.displayAccount(actno);
				break;
			}
			case 2:
			{
				System.out.println("enter account no: ");
				int actno=scanner.nextInt();
				System.out.println("enter deposit amount: ");
				int val=scanner.nextInt();
				System.out.println("Balance: "+ boa.deposit(val, actno));
				break;
			}
			case 3:
			{
				System.out.println("enter account no: ");
				int actno=scanner.nextInt();
				System.out.println("enter withdraw amount: ");
				int val=scanner.nextInt();
				System.out.println("Balance: "+ boa.withdraw(val, actno));
				break;
			}
			case 4:
			{
				System.out.println("enter account no: ");
				int actno=scanner.nextInt();
				System.out.println("Balance: "+boa.balance(actno));
				break;
			}
			case 5:
			{
				System.out.println("exiting..");
				//System.exit(0);
				break;
			}
			}
			
		}while(choice!=5 );
			
		
	}	
	

}

