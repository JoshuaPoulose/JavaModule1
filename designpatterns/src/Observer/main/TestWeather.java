package Observer.main;

import Observer.consumers.NewsPaper;
import Observer.consumers.TVChannel;
import Observer.subjectimpl.WeatherStation;

public class TestWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVChannel observer1 = new TVChannel(); // subscriber
		NewsPaper observer2 = new NewsPaper(); // subscriber
		TVChannel observer3 = new TVChannel();
	
		WeatherStation weatherStation = new WeatherStation(33);
		weatherStation.addObserver(observer1);
		weatherStation.addObserver(observer2);
		weatherStation.addObserver(observer3);

		weatherStation.setTemparature(30);

		// weatherStation.removeObserver(observer1);

	}

}
