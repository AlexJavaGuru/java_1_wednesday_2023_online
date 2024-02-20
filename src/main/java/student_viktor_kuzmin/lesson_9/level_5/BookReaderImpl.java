package student_viktor_kuzmin.lesson_9.level_5;

import java.util.ArrayList;
import java.util.List;

abstract class BookReaderImpl implements BookReader {

    private List<Book> library;

    public BookReaderImpl() {
        library = new ArrayList<>();
    }

    @Override
    public boolean addBook(String author, String name) {
        Book newBook = new Book(author, name);
        for (Book book : library) {
            if (book.equals(newBook)) {
                System.out.println("Library already have that book");
                return false;
            }
        }
        newBook = new Book(author, name);
        library.add(newBook);
        System.out.println("The book was successfully added to the library ");
        return true;
    }

    @Override
    public boolean addWithNoEmptyAuthorOrName(String author, String name) {
        if (author == null || author.isEmpty() || name == null || name.isEmpty()) {
            System.out.println("False! Author or name not introduced");
            return false;
        }
        System.out.println("The book was successfully added to the library");
        return true;
    }

    @Override
    public boolean removeBook(String author, String name) {
        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            if (book.getAuthor().equalsIgnoreCase(author) && book.getName().equalsIgnoreCase(name)) {
                library.remove(i);
                System.out.println("The book was successfully deleted");
                return true;
            }
        }
        System.out.println("False. The book was not found in library");
        return false;
    }
    @Override
    public String[] getAllBooks() {
        String[] bookList = new String[library.size()];
        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            bookList[i] = book.getAuthor() + " [" + book.getName() + "]";
        }
        return bookList;
    }

    @Override
    public String[] findBooksByAuthor(String author) {
        List<String> bookList = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                bookList.add(book.getName() + " [" + book.getAuthor() + "]");
            }
        }
        return bookList.toArray(new String[0]);
    }

    @Override
    public String[] findBooksByName(String name) {
        List<String> bookList = new ArrayList<>();
        for (Book book : library) {
            if (book.getName().equalsIgnoreCase(name)) {
                bookList.add(book.getAuthor() + " [" + book.getName() + "]");
            }
        }
        return bookList.toArray(new String[0]);
    }

}


