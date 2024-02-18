package student_viktor_kuzmin.homework_lesson_8.level_7;

import java.util.ArrayList;
import java.util.List;

class Library {

    private final List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book search(String query) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(query) ||
                    book.getAuthor().equalsIgnoreCase(query) ||
                    book.getISBN().equalsIgnoreCase(query)) {
                return book;
            }
        }
        return null;
    }

    public void reserveBook(Book book) {

    }

    public void notifyUsers(Book book) {
    }

    public void calculateFine(User user) {
    }
}
