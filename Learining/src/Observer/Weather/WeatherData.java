package Observer.Weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }

    // Se apelează când apar măsurători noi
    public void measurementsChanged() {
        notifyObservers();
    }

    // Metodă publică pentru actualizarea datelor
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity    = humidity;
        this.pressure    = pressure;
        measurementsChanged();
    }
}
