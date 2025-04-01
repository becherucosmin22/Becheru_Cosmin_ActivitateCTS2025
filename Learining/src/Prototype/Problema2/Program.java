package Prototype.Problema2;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // Creăm un motor și o listă de caracteristici
        Engine engine = new Engine(300, "V8");
        List<String> features = new ArrayList<>();
        features.add("Leather seats");
        features.add("Sunroof");

        // Creăm obiectul original Car
        Car originalCar = new Car("Mustang", "Red", engine, features);

        // Obținem o clonă superficială și una profundă
        Car shallowCloneCar = originalCar.clone();
        Car deepCloneCar = originalCar.deepClone();

        System.out.println("Before modification:");
        System.out.println("Original Car: " + originalCar);
        System.out.println("Shallow Clone Car: " + shallowCloneCar);
        System.out.println("Deep Clone Car: " + deepCloneCar);

        // Modificăm motorul și lista de caracteristici în obiectul original
        originalCar.getEngine().setHorsepower(350);
        originalCar.getFeatures().add("GPS Navigation");

        System.out.println("\nAfter modification:");
        System.out.println("Original Car: " + originalCar);
        System.out.println("Shallow Clone Car: " + shallowCloneCar); // Motorul se va modifica și aici
        System.out.println("Deep Clone Car: " + deepCloneCar);       // Rămâne neschimbat
    }
}