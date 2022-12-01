public class Main {
    public static void main(String[] args) {

        Books computerScience = new Books();
        computerScience.capacity = 10;
        computerScience.categoryCapacity();

        computerScience.addBooks(0,"Effective Java");
        computerScience.addBooks(1,"Thinking in Java");
        computerScience.addBooks(2,"Clean Code");
        computerScience.addBooks(3,"Introduction to Algorithm");
        computerScience.addBooks(4,"Head First Java");
        computerScience.addBooks(5,"Introduction to Algorithm");

        computerScience.totalBooksInStock();

        computerScience.lendBook("Java programming");
        computerScience.lendBook("Clean Code");

        System.out.println();
        System.out.println();

        Books economics = new Books();
        economics.capacity = 7;
        economics.categoryCapacity();

        economics.addBooks(0,"Freakonomics");
        economics.addBooks(1,"Economics for beginners");
        economics.addBooks(2,"Principles of MicroEconomics");

        economics.newBooksUpdate(3,"Extreme Economics");
        economics.lendBook("Freakonomics");
        economics.totalBooksInStock();



    }
}