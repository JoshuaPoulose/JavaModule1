package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jag= new Car();
		jag.color="Blue";
		jag.price=900000;
		jag.brand="Amaze";
		jag.model="Honda";
		System.out.print(jag.color+" ");
		System.out.print(jag.price+" ");
		System.out.print(jag.brand+" ");
		System.out.println(jag.model);
		
		Car bmw=new Car();
		bmw.color="pink";
		bmw.price=890000;
		bmw.brand="BMW";
		bmw.model="luxuary sedan";
		System.out.print(bmw.color+" ");
		System.out.print(bmw.price+" ");
		System.out.print(bmw.brand+" ");
		System.out.print(bmw.model);
	}

}