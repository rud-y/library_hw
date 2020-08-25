import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before() {
        borrower = new Borrower();
        book = new Book("Gone Girl", "Gillian Flynn", "detective story" );
    }

    @Test
    public void startsWithNoBooks() {
        assertEquals(0, borrower.getBorrowedBooks());
    }
}
