package student_svetlana_daugele.lesson_10.level_6;

import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.Book;
import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.BookDatabase;

import java.util.Scanner;

class ContainsUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public ContainsUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's author: ");
        String author = scanner.nextLine();
        System.out.println("Book's title: ");
        String title = scanner.nextLine();
        scanner.close();
        Book bookToCheck = new Book(author, title);
        if (bookDatabase.contains(bookToCheck)) {
            System.out.println("Congratulations! There is such book in the Library");
        } else {
            System.out.println("Sorry! There is no such book in the Library");
        }
    }
}
