package firstTest;

public class Calculator {
	public int power(int b,int e) {
		int p=1;
		int i=1;
		if(b==0||e==0)
			return 0;
		else {
			while(i<=e) {
				p*=b;
				i++;
			}
		}
		return p;
	}
	public int add(int a,int b) {
		return(a+b);
	}
	
	public int fact(int n){
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
