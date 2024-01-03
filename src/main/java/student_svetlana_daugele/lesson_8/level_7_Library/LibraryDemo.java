package student_svetlana_daugele.lesson_8.level_7_Library;

import java.util.List;

class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();


        Book book1 = new Book("War and Peace",111,111,"Lev Tolstoy", "Anatoliy Dogilev", "Eskimo", "Russian classic", 1870, "hardcore", 2021, true);
Book book2 = new Book("Dead souls", 9999, 999, "Nikolai Gogol", "Igor Nemcov","Piter" ,"Russian classic", 1876, "electronic", 2023, true);
        library.addBook(book1);
        library.addBook(book2);


        List<Book> fantasyBooks = library.getBooksByGenre("Russian classic");
        for (Book book : fantasyBooks) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }


        List<Book> booksByAuthor1 = library.getBooksByAuthor("Nikolai Gogol");
        for (Book book : booksByAuthor1) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }


        List<Book> booksByPublisherA = library.getBooksByPublisher("Eskimo");
        for (Book book : booksByPublisherA) {
            System.out.println("Title: " + book.getTitle() + ", Publisher: " + book.getPublisher());
        }
    }
}
