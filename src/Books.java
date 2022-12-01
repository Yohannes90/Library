public class Books {
    String[] bookList;
    int capacity;

    void catagoryCapacity() {
        bookList = new String[capacity];
    }

    public void addBooks(int bookCode, String bookName) {
        bookList[bookCode] = bookName;
        System.out.println(bookName + " is added to inventory!");
    }

    public void lendBook(int bookCode, String bookName) {
        bookList[bookCode] = null;
        for(int i = 0;i<=bookList.length-1;i++) {
            if (bookName == bookList[i]){
                System.out.println("Books is available; Please bring identification");
            }else
                System.out.println("We don't have "+bookName+" currently please check another time!");

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

    public int totalBooksInStock() {
        return bookList.length;
    }
}
