import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(990);
        book = new Book("Gone Girl", "Gillian Flynn", "detective story" );
    }

    @Test
    public void libraryStartsWithNoBooks() {
        assertEquals(0, library.getBooks());
    }

}
