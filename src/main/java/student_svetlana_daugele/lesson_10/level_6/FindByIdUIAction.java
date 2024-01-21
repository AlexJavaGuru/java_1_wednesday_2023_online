package student_svetlana_daugele.lesson_10.level_6;

import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.Book;
import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's ID: ");
        Long booksId = scanner.nextLong();
        Optional<Book> bookOptional = bookDatabase.findById(booksId);
        System.out.println(bookOptional);
        // запросите id книги с консоли у пользователя
        // поиск книги в базе данных: Optional<Book> bookOpt = bookDatabase.findById(id);
        // выведите на консоль результаты поиска
    }

}
