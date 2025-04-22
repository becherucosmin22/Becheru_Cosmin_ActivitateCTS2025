package Observer.Weather;

public class HeatIndexDisplay implements Observer {
    private float heatIndex;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // Simplu calcul pentru exemplu:
        heatIndex = (float)(-8.78469475556
                + 1.61139411 * temperature
                + 2.33854883889 * humidity
                - 0.14611605 * temperature * humidity);
        display();
    }

    public void display() {
        System.out.println("Heat index is " + heatIndex);
    }
}