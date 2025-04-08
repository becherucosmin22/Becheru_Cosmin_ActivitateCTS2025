package Decorator.Library;

public class BasicBook implements Book {
    private String title;

    public BasicBook(String title) {
        this.title = title;
    }

    @Override
    public String getDescription() {
        return title;
    }

    @Override
    public double getCost() {
        // Prețul de bază al cărții, exemplu fix
        return 10.0;
    }
}
