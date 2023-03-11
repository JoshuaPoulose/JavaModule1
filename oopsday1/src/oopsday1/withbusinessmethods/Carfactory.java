package oopsday1.withbusinessmethods;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car jag= new Car("yellow",800000,"benz","c class");
		jag.start();
		jag.ChangeGear(1);
		jag.stop();
		
//		System.out.println(jag.hashCode());
//		System.out.println(Integer.toHexString(jag.hashCode()));
//		System.out.println(jag);
		
//		jag.setColor("Red");
//		jag.setBrand("Jaguar");
//		jag.setModel("sedan");
//		jag.setPrice(900000);
		
//		System.out.println(jag.getColor());
//		System.out.println(jag.getBrand());
//		System.out.println(jag.getModel());
//		System.out.println(jag.getPrice());
		
		/*
		 * jag.color="Blue"; jag.price=900000; jag.brand="Amaze"; jag.model="Honda";
		 * System.out.print(jag.color+" "); System.out.print(jag.price+" ");
		 * System.out.print(jag.brand+" "); System.out.println(jag.model);
		 */
		
		
		Car bmw =new Car("blue",8900000,"toyota","inova");
		bmw.start();
		bmw.ChangeGear(2);
		bmw.stop();
//		System.out.println(bmw.hashCode());
//		System.out.println(Integer.toHexString(bmw.hashCode()));
//		System.out.println(bmw);
//		bmw.setColor("Red");
//		bmw.setBrand("Jaguar");
//		bmw.setModel("sedan");
//		bmw.setPrice(900000);
		
//		System.out.println(bmw.getColor());
//		System.out.println(bmw.getBrand());
//		System.out.println(bmw.getModel());
//		System.out.println(bmw.getPrice());
		
		/*
		 * bmw.color="pink"; bmw.price=890000; bmw.brand="BMW";
		 * bmw.model="luxuary sedan"; System.out.print(bmw.color+" ");
		 * System.out.print(bmw.price+" "); System.out.print(bmw.brand+" ");
		 * System.out.print(bmw.model);
		 */
	}

}