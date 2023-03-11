package point;
import java.util.Scanner;

public class p1 implements PointIface {
	private int x1;
	private int y1;
	
	public p1() {
		
	}
	

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		Scanner scanner= new Scanner(System.in);
		
		System.out.println("enter x1= ");
		int x1=scanner.nextInt();
		System.out.println("enter y1= ");
		int y1=scanner.nextInt();

	}




}
