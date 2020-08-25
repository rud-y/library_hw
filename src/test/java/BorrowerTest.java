import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library cityLibrary;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("Gone Girl", "Gillian Flynn", "detective story" );
        cityLibrary = new Library(800);
    }

    @Test
    public void borrowerStartsWithNoBooks() {
        assertEquals(0, borrower.getBorrowedBooks());
    }

    @Test
    public void canBorrowABook() {
        borrower.borrowBook(cityLibrary,book);
        assertEquals(1, borrower.getBorrowedBooks());
    }

}
