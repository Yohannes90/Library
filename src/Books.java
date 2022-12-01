public class Books {
    String[] bookList;
    int capacity;

    void categoryCapacity() {
        bookList = new String[capacity];
    }

    public void addBooks(int bookCode, String bookName) {
        bookList[bookCode] = bookName;
        System.out.println(bookName + " is added to inventory!");
    }

    public void lendBook(String bookName) {

        for(int i = 0;i < bookList.length;i++) {
            boolean isAvailable = bookName.equalsIgnoreCase(bookList[i]);
            if (isAvailable) {
                System.out.println(bookName + " is available; Please provide identification for assurance!");
                bookList[i] = null;
                break;
            }
            else if (i == bookList.length - 1){
                System.out.println("We don't have " + bookName + " currently on stock please check another time!");
            }
        }

    }

    public void returnedBook(int bookCode, String bookName){
        bookList[bookCode] = bookName;
        System.out.println("loaned book "+ bookName +" has been returned to stock!");
    }

    public void newBooksUpdate(int bookCode, String bookName) {
        bookList[bookCode] = bookName;
        System.out.println("new book"+ bookName +" has been added to stock!");
    }

    public void totalBooksInStock() {
        int count = 0;
        for(int i = 0; i < bookList.length; i++){
            if (bookList[i] == null)
                count++;
        }
            System.out.println(bookList.length-count);

    }

}
