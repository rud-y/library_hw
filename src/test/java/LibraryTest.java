import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before() {
        library = new Library(500);
        book = new Book("Gone Girl", "Gillian Flynn", "detective story" );
    }

    @Test
    public void libraryStartsWithNoBooks() {
        assertEquals(0, library.getBooks());
    }

    @Test
    public void canAddBookToLibraryStock() {
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.getBooks());
    }

    @Test
    public void notEnoughCapacityToAddBook() {
        for(int i = 0; i < 500; i++){
            library.addBook(book);
        }
        library.addBook(book);
        assertEquals(500, library.getBooks());
    }
}
