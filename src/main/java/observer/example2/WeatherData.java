package observer.example2;

import java.math.BigDecimal;
import java.util.Observable;

public class WeatherData extends Observable {

    private BigDecimal temperature;
    private BigDecimal pressure;

    public void setWeatherData(BigDecimal temperature, BigDecimal pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        measurementChanged();
    }

    public void measurementChanged() {
        setChanged();
        notifyObservers();
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public BigDecimal getPressure() {
        return pressure;
    }
}
