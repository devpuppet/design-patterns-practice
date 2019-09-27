package observer.example1;

import java.math.BigDecimal;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private BigDecimal tempreature;
    private BigDecimal pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject subject) {
        this.weatherData = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(String.format("Current weather conditions:" +
                "\n - Temperature = %s\n - Pressure = %s", tempreature, pressure));
    }

    @Override
    public void turnOff() {
        weatherData.removeObserver(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject.getClass().equals(WeatherData.class)) {
            WeatherData data = (WeatherData) subject;
            this.tempreature = data.getTemperature();
            this.pressure = data.getPressure();
            display();
        }
    }
}
