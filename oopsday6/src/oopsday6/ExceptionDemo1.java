package oopsday6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program begins");
		Scanner sc=new Scanner(System.in);

		try {
			System.out.println("enter input 1: ");
			int a=sc.nextInt();

			System.out.println("enter input 2: ");
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			}catch(ArithmeticException e){
				System.out.println("cannot / by 0");
			}catch(InputMismatchException e) {
				System.out.println("invalid input");
			}
		System.out.println("program complete");

	}

}
