package student_viktor_kuzmin.homework_lesson_8.level_7;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List<Book> booksOnLoan;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.booksOnLoan = new ArrayList<>();
    }

    public void addBookOnLoan(Book book) {
        booksOnLoan.add(book);
    }

    public void removeBookOnLoan(Book book) {
        booksOnLoan.remove(book);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBooksOnLoan() {
        return booksOnLoan;
    }

    public void setBooksOnLoan(List<Book> booksOnLoan) {
        this.booksOnLoan = booksOnLoan;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", booksOnLoan=" + booksOnLoan +
                '}';
    }
}
