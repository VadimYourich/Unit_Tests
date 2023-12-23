package seminar4.hw;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BookServiceTest {

    @Test
    void FindBookById() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        String id = "1";
        Book book = new Book(id, "Book1", "Author1");
        when(bookRepository.findById(id)).thenReturn(book);
        Book result = bookService.findBookById(id);
        verify(bookRepository).findById(id);
        assertEquals(book, result);
    }

    @Test
    void FindAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        List<Book> books = Arrays.asList(
                new Book("1", "Book1", "Author1"),
                new Book("2", "Book2", "Author2")
        );
        when(bookRepository.findAll()).thenReturn(books);
        List<Book> result = bookService.findAllBooks();
        verify(bookRepository).findAll();
        assertEquals(books, result);
    }
}