package student_svetlana_daugele.lesson_10.level_6;

import student_svetlana_daugele.lesson_10.level_2_and_3_and_4_and_5.BookDatabase;

class GetAuthorToBookMap implements UIAction {
    private BookDatabase bookDatabase;

    public GetAuthorToBookMap(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println(bookDatabase.getAuthorToBooksMap());
    }
}
