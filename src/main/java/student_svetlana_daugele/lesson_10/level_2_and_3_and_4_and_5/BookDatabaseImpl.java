package student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;


public class BookDatabaseImpl implements BookDatabase {
    private final List<Book> myBooks = new ArrayList<>();
    private Long id = 0L;

    public List<Book> getMyBooks() {
        return myBooks;
    }

    @Override
    public Long save(Book book) {
        myBooks.add(book);
        book.setId(++id);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : myBooks) {
            if (book.getId().equals(bookId)) {
                myBooks.remove(book);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        if (myBooks.contains(book)) {
            myBooks.remove(book);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : myBooks) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return myBooks.stream()
                .filter(book -> author.equals(book.getAuthor()))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findByTitle(String title) {
        return myBooks.stream()
                .filter(book -> title.equals(book.getTitle()))
                .collect(Collectors.toList());
    }

    @Override
    public int countAllBooks() {
        return myBooks.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> temp = new ArrayList<>();
        for (Book book : myBooks) {
            if (book.getAuthor().equals(author)) {
                temp.add(book);
            }
        }
        myBooks.removeAll(temp);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> temp = new ArrayList<>();
        for (Book book : myBooks) {
            if (book.getTitle().equals(title)) {
                temp.add(book);
            }
        }
        myBooks.removeAll(temp);
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {

        List<Book> searchedBooks = new ArrayList<>();
        for (Book book : myBooks) {
            if (searchCriteria.match(book)) {
                searchedBooks.add(book);
            }
        }
        return searchedBooks;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> uniqueAuthors = new HashSet<>();
        for (Book book : myBooks) {
            uniqueAuthors.add(book.getAuthor());
        }
        return uniqueAuthors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> uniqueTitle = new HashSet<>();
        for (Book book : myBooks) {
            uniqueTitle.add(book.getTitle());
        }
        return uniqueTitle;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(myBooks);
    }

    @Override
    public boolean contains(Book book) {
        return myBooks.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        return myBooks.stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        return myBooks.stream()
                .collect(Collectors.groupingBy(Book::getAuthor, Collectors.summingInt(book -> 1)));
    }
}