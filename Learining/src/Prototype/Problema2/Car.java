package Prototype.Problema2;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable {
    private String model;
    private String color;
    private Engine engine;
    private List<String> features;

    public Car(String model, String color, Engine engine, List<String> features) {
        this.model = model;
        this.color = color;
        // Creăm o copie a listei pentru a evita referințierea directă
        this.features = new ArrayList<>(features);
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    // Shallow copy: se clonează Car, dar engine rămâne aceeași referință (deși lista de features se copiază)
    @Override
    public Car clone() {
        try {
            Car cloned = (Car) super.clone();
            cloned.features = new ArrayList<>(this.features);
            // engine nu este clonat – se face shallow copy
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    // Deep copy: clonăm și engine-ul pentru a avea o copie independentă
    public Car deepClone() {
        Car cloned = this.clone();
        cloned.engine = this.engine.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", features=" + features +
                '}';
    }
}
