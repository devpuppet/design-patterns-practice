package observer.example2;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private BigDecimal tempreature;
    private BigDecimal pressure;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.tempreature = weatherData.getTemperature();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("Current weather conditions:" +
                "\n - Temperature = %s\n - Pressure = %s", tempreature, pressure));
    }

}
