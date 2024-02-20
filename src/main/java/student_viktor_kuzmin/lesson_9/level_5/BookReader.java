package student_viktor_kuzmin.lesson_9.level_5;

public interface BookReader {

    boolean addBook(String author, String name);
    boolean addWithNoEmptyAuthorOrName(String author, String name);
    boolean removeBook(String author, String name);
    String[] getAllBooks();
    String[] findBooksByAuthor(String author);
    String[] findBooksByName(String name);
    }

