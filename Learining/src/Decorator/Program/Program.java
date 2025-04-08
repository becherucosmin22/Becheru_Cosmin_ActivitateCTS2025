package Decorator.Program;

import Decorator.Library.AutographedDecorator;
import Decorator.Library.BasicBook;
import Decorator.Library.Book;
import Decorator.Library.IllustratedDecorator;

public class Program {
    public static void main(String[] args) {
        // Creăm o carte de bază
        Book myBook = new BasicBook("The Great Gatsby");

        // Afișăm informațiile cărții de bază
        System.out.println(myBook.getDescription() + " - Cost: " + myBook.getCost());

        // Decorăm cartea cu ilustrații
        myBook = new IllustratedDecorator(myBook);
        System.out.println(myBook.getDescription() + " - Cost: " + myBook.getCost());

        // Decorăm cartea (deja ilustrată) cu autograf
        myBook = new AutographedDecorator(myBook);
        System.out.println(myBook.getDescription() + " - Cost: " + myBook.getCost());
    }
}
