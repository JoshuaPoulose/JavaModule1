package Testlambdas;
interface shape{
	double area();
}
interface Math{
	double power(int b, int e);
}
interface fact{
	int factrorial (int a);
}
public class example1 {

	public static void main(String[] args) {
		fact f=(int a)-> {
			int factorial=1;
			for(int i=1;i<=a;i++) {
				factorial=factorial*i;
			}
			return factorial; 
		};

		System.out.println(f.factrorial(5));
		
		Runnable r1= new Runnable() {
			public void run() {
				System.out.println("from run method");
			}
		};
		
		Runnable r=()->{
			for(int i=1;i<=5;i++) {
				System.out.println("in run method"+i);
			}
		};
		Thread t1=new Thread(r1);
		t1.start();
		
		
		
		Math m = (int b, int e)->{
			int p=1;
			for(int i=1;i<=e;i++) {
				p *=b;
			}
			return p;
		};
		
		double power=m.power(2, 3);
		System.out.println(power);
		shape s=()->{
			return 0.0;
		};
		double result=s.area();
		System.out.println(result);

	}

}
