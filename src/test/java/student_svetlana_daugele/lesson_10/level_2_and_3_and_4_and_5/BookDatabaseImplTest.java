package student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookDatabaseImplTest {

    BookDatabaseImpl bookDatabase;

    @BeforeEach
    void setUp() {
        bookDatabase = new BookDatabaseImpl();
        bookDatabase.save(new Book("1", "a"));
        bookDatabase.save(new Book("1", "b"));
        bookDatabase.save(new Book("1", "c"));
        bookDatabase.save(new Book("2", "d"));
        bookDatabase.save(new Book("2", "e"));
        bookDatabase.save(new Book("2", "f"));
    }

    @Test
    void save() {
        Book book = new Book("3", "h");
        int sizeBefore = bookDatabase.getMyBooks().size();
        bookDatabase.save(book);
        bookDatabase.save(book);
        bookDatabase.save(book);
        int sizeAfter = bookDatabase.getMyBooks().size();
        assertEquals(sizeBefore, sizeAfter - 3, "Size is not correct");
    }

    @Test
    void delete() {
        Book book = new Book("2", "f");
        int sizeBefore = bookDatabase.getMyBooks().size();
        bookDatabase.delete(book);
        int sizeAfter = bookDatabase.getMyBooks().size();
        assertEquals(sizeBefore, sizeAfter + 1, "Size is not correct");
    }

    @Test
    void countAllBooks() {
    }
}