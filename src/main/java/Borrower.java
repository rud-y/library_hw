import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        borrowedBooks = new ArrayList<Book>();
    }


    public int getBorrowedBooks() {
        return this.borrowedBooks.size();
    }
}
