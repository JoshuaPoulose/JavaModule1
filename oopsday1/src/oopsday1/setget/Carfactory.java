package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jag= new Car();
		jag.setColor("Red");
		jag.setBrand("Jaguar");
		jag.setModel("sedan");
		jag.setPrice(5600000);
		
		System.out.println(jag.getColor());
		System.out.println(jag.getBrand());
		System.out.println(jag.getModel());
		System.out.println(jag.getPrice());
		
		/*
		 * jag.color="Blue"; jag.price=900000; jag.brand="Amaze"; jag.model="Honda";
		 * System.out.print(jag.color+" "); System.out.print(jag.price+" ");
		 * System.out.print(jag.brand+" "); System.out.println(jag.model);
		 */
		
		Car bmw =new Car();
		bmw.setColor("Blue");
		bmw.setBrand("Honda");
		bmw.setModel("xuv");
		bmw.setPrice(900000);
		
		System.out.println(bmw.getColor());
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getModel());
		System.out.println(bmw.getPrice());
		
		/*
		 * bmw.color="pink"; bmw.price=890000; bmw.brand="BMW";
		 * bmw.model="luxuary sedan"; System.out.print(bmw.color+" ");
		 * System.out.print(bmw.price+" "); System.out.print(bmw.brand+" ");
		 * System.out.print(bmw.model);
		 */
	}

}