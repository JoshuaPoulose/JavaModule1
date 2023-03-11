package point;

import java.util.Scanner;

public class p2 implements PointIface {
	private int x2;
	private int y2;
	
	public p2() {
		
	}



	@Override
	public void draw() {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);

		System.out.println("enter x2= ");
		int x2=scanner.nextInt();
		System.out.println("enter y2= ");
		int y2=scanner.nextInt();
		
	}

}
