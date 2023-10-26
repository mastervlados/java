package gb.homework;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @InjectMocks
    private BookService bookService;
    @Mock
    private BookRepository bookRepository;
    private InMemoryBookRepository inMemoryBookRepository;

    @BeforeEach
    public void setUp() {
        inMemoryBookRepository = new InMemoryBookRepository();
    }

    @Test
    public void testFindById() {
        Mockito.when(bookService.findBookById("1")).thenReturn(inMemoryBookRepository.findById("1"));
        Mockito.when(bookService.findBookById(anyString())).thenReturn(bookRepository.findById(anyString()));
    }

    @Test
    public void testFindAllBooks() {
        Mockito.when(bookService.findAllBooks()).thenReturn(inMemoryBookRepository.findAll());
        Mockito.when(bookService.findAllBooks()).thenReturn(bookRepository.findAll());
    }
}
