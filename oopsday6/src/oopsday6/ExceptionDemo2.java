package oopsday6;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("program started");
		try {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		String name=args[2];
		int c=a/b;
		
		int data[]= {a,b};
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("program completed");

	}

}
