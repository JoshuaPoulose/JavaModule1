package oopsday1.withbusinessmethods;

public class Car {
	//properties data members, instance variables,attributes
	private String color;
	private double price;
	private String brand;
	private String model;
	public String getColor() {
		return color;
	}
	public Car(String color, double price, String brand, String model) {
		
		this.color = color;
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void start() {
		System.out.println("car is starting....");
	}
	public void ChangeGear(int gear) {
		System.out.println("car is in gear "+ gear);
	}
	public void stop() {
		System.out.println("car is stopping..");
	}
	@Override
	public String toString() {
		return "i am car "+ brand;
	}
	

}
