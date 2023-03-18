package LSP;

public class LSPDemo {
	public void calculatorArea(Shape s) {
		System.out.println(s.getArea());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LSPDemo lsp=new LSPDemo();
		lsp.calculatorArea(new Rectangle(1,4));
		lsp.calculatorArea(new Square(5));

	}

}
