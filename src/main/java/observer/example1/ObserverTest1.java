package observer.example1;

import java.math.BigDecimal;

public class ObserverTest1 {

    public static void run() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setWeatherData(new BigDecimal(21.2), new BigDecimal(1004));
        weatherData.setWeatherData(new BigDecimal(22.0), new BigDecimal(999));

        currentConditionsDisplay.turnOff();

        weatherData.setWeatherData(new BigDecimal(23.7), new BigDecimal(1010));

        weatherData.registerObserver(currentConditionsDisplay);

        weatherData.setWeatherData(new BigDecimal(24.9), new BigDecimal(1012));
    }

}
