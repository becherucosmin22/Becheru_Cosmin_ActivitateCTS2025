package Decorator.Library;

public abstract class BookDecorator implements Book {
    protected Book decoratedBook;

    public BookDecorator(Book decoratedBook) {
        this.decoratedBook = decoratedBook;
    }

    @Override
    public String getDescription() {
        return decoratedBook.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedBook.getCost();
    }
}