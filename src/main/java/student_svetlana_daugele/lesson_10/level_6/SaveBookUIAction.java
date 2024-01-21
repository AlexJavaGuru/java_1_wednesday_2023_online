package student_svetlana_daugele.lesson_10.level_6;

import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.BookDatabase;
import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.Book;

import java.util.Scanner;


class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book title: ");
        String title = scanner.nextLine();
        System.out.println("Book author: ");
        String author = scanner.nextLine();
        System.out.println("Year of issue: ");
        String year = scanner.nextLine();
        Book book = new Book(title, author, year);
        bookDatabase.save(book);

    }
}
