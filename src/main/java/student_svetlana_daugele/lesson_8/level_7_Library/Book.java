package student_svetlana_daugele.lesson_8.level_7_Library;

public class Book {
    public int barCode;
    public int isbn;
    public String author;
    public String illustrator;
    public String publisher;
    public int publicationYear;
    public String type;
    public int issueYear;
    public String genre;
    public String title;
    private boolean available;

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book(String title, int barCode, int isbn, String author, String illustrator,
                String publisher, String genre, int publicationYear, String type, int issueYear, boolean available) {
        this.barCode = barCode;
        this.isbn = isbn;
        this.author = author;
        this.illustrator = illustrator;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
        this.type = type;
        this.issueYear = issueYear;
        this.genre =  genre;
        this.title = title;
    }
    public void changeAvailability(boolean availability) {
        this.available = availability;
    }

    public void borrowBook(){

    }
    public void returnBook(){

    }
    public void reserveBook(){

    }

    public void addBook(){

    }
}
/*

reserved book, borrowed book??
Разработать доменную модель для электронной системы управления библиотекой.
Доменная модель должна в будущем давать возможность поддерживать следующие операции:
- взять книгу из библиотеки;
- вернуть книгу в библиотеку;
- поиск нужной книги;
- резервация книги;
- рассылка оповещений читателям о сроке сдачи книги в библиотеку;
- выписывание штрафов за вовремя не сданные книги;
- добавление новой книги в библиотеку.

В рамках данной задачи нужно только попробовать разработать модель
данных (pojo Plain Old Java Object классы), которые будут описывать данные, которые нужны для
реализации указанных выше операций. Можно создать модель, которая будет
поддерживать только часть указанных выше операций.
 */