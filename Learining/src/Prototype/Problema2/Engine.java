package Prototype.Problema2;

public class Engine implements Cloneable {
    private int horsepower;
    private String type; // ex: "V8", "Electric", etc.

    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Engine clone() {
        try {
            return (Engine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsepower=" + horsepower +
                ", type='" + type + '\'' +
                '}';
    }
}