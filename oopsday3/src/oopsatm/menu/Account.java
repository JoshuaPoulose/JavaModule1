package oopsatm.menu;

public class Account {
	private int actno;
	private String name;
	private String acttype;
	private double balance;
	
	public Account() {
		
	}
	public Account(int actno, String name, String acttype, double balance) {
		super();
		this.actno = actno;
		this.name = name;
		this.acttype = acttype;
		this.balance = balance;
	}
	public int getActno() {
		return actno;
	}
	public void setActno(int actno) {
		this.actno = actno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActtype() {
		return acttype;
	}
	public void setActtype(String acttype) {
		this.acttype = acttype;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [actno=" + actno + ", name=" + name + ", acttype=" + acttype + ", balance=" + balance + "]";
	}
	
	
	
	

}
