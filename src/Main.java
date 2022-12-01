public class Main {
    public static void main(String[] args) {

        Books computerScience = new Books();

        computerScience.capacity = 10;
        computerScience.catagoryCapacity();

        computerScience.addBooks(100,"Java programming");
        computerScience.addBooks(180,"Programming book");
        computerScience.addBooks(1242,"Phyton");

        computerScience.totalBooksInStock();

    }
}