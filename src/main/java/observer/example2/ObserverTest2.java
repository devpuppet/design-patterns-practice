package observer.example2;

import java.math.BigDecimal;

public class ObserverTest2 {

    public static void run() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setWeatherData(new BigDecimal(12.2), new BigDecimal(1004));
        weatherData.setWeatherData(new BigDecimal(13.0), new BigDecimal(999));

        weatherData.deleteObserver(currentConditionsDisplay);

        weatherData.setWeatherData(new BigDecimal(14.7), new BigDecimal(1010));

        weatherData.setWeatherData(new BigDecimal(15.9), new BigDecimal(1012));
    }

}
