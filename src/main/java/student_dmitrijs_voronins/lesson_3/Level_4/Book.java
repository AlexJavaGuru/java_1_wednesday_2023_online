package student_dmitrijs_voronins.lesson_3.Level_4;

class Book {

    String title;

    public Book(String newTitle){
        this.title = newTitle;
    }
    String getTitle(){
        return this.title;
    }

}
//Найти ошибку в коде.
//Исправить и запустить программу.
//Менять можно только класс Book.
//
//class Book {
//
//    String title
//
//    Book(String bookTitle) {
//        this.title = newTitle
//    }
//
//    String getTitle() {
//        return this.title;
//    }
//
//}
//
//class BookDemo {
//
//    public static void main(String[] args) {
//        Book myBook = new Book("Principles");
//        String bookTitle = myBook.getTitle();
//        System.out.println("Book title = " + bookTitle);
//    }
//
//}