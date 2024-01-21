package student_svetlana_daugele.lesson_10.level_1;


import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {
    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();

        Book book1 = new Book("A1", "B1");
        Book book2 = new Book("A2", "B2");

        books.add(book1);
        books.add(book2);

        Book bookInTheList = new Book("A1", "B1");
        boolean containsBook = books.contains(bookInTheList);
        System.out.println(containsBook);

    }
}
/*
Создайте класс BookListContainsDemo в котором продемонстрируйте как
делают проверку есть ли в списке книга или её нет с помощью метода
contains(). Если для правильной работы метода contains() требуется
внести изменения в класс Book, сделайте это!

Пример:

List<Book> books = new ArrayList<>();

Book book1 = new Book("A1", "B1");
Book book2 = new Book("A2", "B2");

books.add(book1);
books.add(book2);

Book bookInTheList = new Book("A1", "B1");
boolean containsBook = books.contains(bookInTheList); // должно быть true

Book bookNotInTheList = new Book("A3", "B3");
boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false

 */