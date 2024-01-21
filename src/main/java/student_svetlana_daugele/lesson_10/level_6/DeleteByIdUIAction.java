package student_svetlana_daugele.lesson_10.level_6;

import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.BookDatabase;

import java.util.Scanner;

class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Book's id: ");
        Long id = scanner.nextLong();
        if (bookDatabase.delete(id)) {
            System.out.println("Book is deleted");
        } else {
            System.out.println("Book not found");
        }

    }

}
