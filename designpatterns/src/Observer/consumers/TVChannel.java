package Observer.consumers;

import Observer.iface.WeatherObserver;

public class TVChannel implements WeatherObserver {

	@Override
	public void doUpdate(int temperature) {
		// TODO Auto-generated method stub
		System.out.println("TV Channel updating temperature as "+temperature);
	}

}
