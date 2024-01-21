package student_svetlana_daugele.lesson_10.level_6;

import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.Book;
import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.BookDatabase;

import java.util.List;
import java.util.Scanner;

class FindByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's title: ");
        String titleName = scanner.nextLine();
        List<Book> books = bookDatabase.findByTitle(titleName);
        System.out.println(books);
    }

}
