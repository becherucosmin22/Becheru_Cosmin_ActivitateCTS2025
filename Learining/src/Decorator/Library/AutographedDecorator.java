package Decorator.Library;

public class AutographedDecorator extends BookDecorator {

    public AutographedDecorator(Book decoratedBook) {
        super(decoratedBook);
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription() + " (Autografiată)";
    }

    @Override
    public double getCost() {
        return decoratedBook.getCost() + 7.5;
    }
}