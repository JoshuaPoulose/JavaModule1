package shape;

public class Rec implements ShapeIrect {
	private double l;
	private double w;
	
	public Rec() {
		
	}
	public Rec(double l, double w) {
		
		this.l = l;
		this.w = w;
	}
	

	

	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	
	
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("area= "+l*w);

	}
	@Override
	public String toString() {
		return "Rec [l=" + l + ", w=" + w + "]";
	}
	
	

	
}
