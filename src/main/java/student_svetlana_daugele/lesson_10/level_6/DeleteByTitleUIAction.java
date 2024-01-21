package student_svetlana_daugele.lesson_10.level_6;

import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Title to delete: ");
        String title = scanner.nextLine();
        scanner.close();
        bookDatabase.deleteByTitle(title);
    }
}
