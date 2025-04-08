package Decorator.Library;

public class IllustratedDecorator extends BookDecorator {

    public IllustratedDecorator(Book decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription() + " (Ilustrată)";
    }

    @Override
    public double getCost() {
        return decoratedBook.getCost() + 5.0;
    }
}
