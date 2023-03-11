package oopsatm.menu;

public interface BankingIface2 {
	public abstract double createaccount();
	public abstract double withdraw(double amount, int actno);
	public abstract double deposit(double amount, int actno);
	public abstract double balance(int actno);
	public abstract double exit();
	
	
}
