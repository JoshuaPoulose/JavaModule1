package oopsday2;

public class Carfactory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CarIface car = new CarIface();(invalid)
	//	CarIface car;//not referring to any object
		CarIface car=new Car(5000,500,0,false);
		car.start();
		car.honk();
		car.move();
		car.stop();
		System.out.println(car);
	}

}
