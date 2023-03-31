package factorymethod;

public class Seltos implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("starting...."+getClass());

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

		System.out.println("stoping...."+getClass());

	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub

		System.out.println("kee keee...."+getClass());
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

		System.out.println("its moving...."+getClass());

	}

}
