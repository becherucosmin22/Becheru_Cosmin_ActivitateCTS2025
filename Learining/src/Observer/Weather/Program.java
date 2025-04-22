package Observer.Weather;

public class Program {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        HeatIndexDisplay heatIndexDisplay       = new HeatIndexDisplay();

        // Înregistrăm observatorii
        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(heatIndexDisplay);

        // Simulăm sosirea de date noi
        weatherData.setMeasurements(25.0f, 65.0f, 1013.1f);
        weatherData.setMeasurements(27.5f, 70.0f, 1009.5f);

        // Dacă vrem să oprim notificările unui observer:
        weatherData.removeObserver(currentDisplay);
        weatherData.setMeasurements(30.0f, 90.0f, 1005.0f);
    }
}