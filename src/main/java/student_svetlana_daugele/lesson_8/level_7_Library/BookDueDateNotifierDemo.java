package student_svetlana_daugele.lesson_8.level_7_Library;

import java.time.LocalDate;

class BookDueDateNotifierDemo {
    public static void main(String[] args) {
        Book book = new Book("War and Peace",111,111,"Lev Tolstoy", "Anatoliy Dogilev", "Eskimo", "Russian classic", 1870, "hardcore", 2021, true);


        LibraryMember member = new LibraryMember(1, "John Doe", "john.due@example.com", 123456, 37, 'M');

        LocalDate dueDate = LocalDate.now().plusDays(10);
        Loan loan = new Loan(1, book, member, LocalDate.now(), dueDate, false);

        BookDueDateNotifier notifier = new BookDueDateNotifier();
        notifier.scheduleNotification(loan);

        notifier.stopScheduler();
    }
}
