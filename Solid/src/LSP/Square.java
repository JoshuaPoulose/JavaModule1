package LSP;

public class Square implements Shape {
	private int size;
	
	

	public Square(int size) {
		super();
		this.size = size;
	}



	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return this.size*this.size;
	}

}
