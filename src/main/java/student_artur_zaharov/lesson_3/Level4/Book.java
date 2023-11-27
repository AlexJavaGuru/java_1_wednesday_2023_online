package student_artur_zaharov.lesson_3.Level4;

public class Book {
    String title;

    Book(String newTitle) {

        this.title = newTitle;
    }

    String getTitle() {

        return this.title;
    }

}

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}

