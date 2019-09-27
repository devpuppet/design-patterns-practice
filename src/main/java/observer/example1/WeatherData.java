package observer.example1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private BigDecimal temperature;
    private BigDecimal pressure;

    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(t -> t.update(this));
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public BigDecimal getPressure() {
        return pressure;
    }

    public void setWeatherData(BigDecimal temperature, BigDecimal pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        measurementChanged();
    }

    public void measurementChanged() {
        notifyObservers();
    }
}
