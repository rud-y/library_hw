import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        book = new Book("Gone Girl", "Gillian Flynn", "detective story" );
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Gone Girl", book.getTitle());
    }

}
