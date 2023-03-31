package maths;

public class Math implements mathIface {
	
	private double a;
	private double b;
	private int n;
	
	public Math() {
		
	}
	

	public Math(double a, double b, int n) {
		super();
		this.a = a;
		this.b = b;
		this.n = n;
	}
	


	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}
	
	public double getN() {
		return n;
	}


	public void setN(int n) {
		this.n = n;
	}


	@Override
	public void add() {
		
		System.out.println("a + b ="+(a+b));

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("a - b ="+(a-b));

	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("a / b ="+(a/b));

	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("a * b ="+(a*b));

	}
	
	@Override
	public void fact() {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		System.out.println("fact of "+ n +"= "+fact);

	}


	@Override
	public String toString() {
		return "Math [a=" + a + ", b=" + b + "]";
	}
	
	
	
	

}
