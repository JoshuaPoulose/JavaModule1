package simple;

import java.util.Scanner;

public class capt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("enter total amount : ");
		int total=sc.nextInt();
		System.out.print(" enter total no. of peoples : ");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.print("enter amount of person "+i+ "=");
			int b=sc.nextInt();
			sum=sum+b;
		}
		if(sum==total) {
			System.out.println("succes");
		}
		else if(sum>total) {
			System.out.println("money exceeded");
		}
		else {
			System.out.println("money insuffient");
		}
		
		

	}

}
