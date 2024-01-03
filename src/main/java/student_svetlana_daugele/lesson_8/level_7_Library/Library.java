package student_svetlana_daugele.lesson_8.level_7_Library;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Library {
        private Map<String, List<Book>> catalogByGenre;
        private Map<String, List<Book>> catalogByAuthor;
        private Map<String, List<Book>> catalogByPublisher;

        public Library() {
            catalogByGenre = new HashMap<>();
            catalogByAuthor = new HashMap<>();
            catalogByPublisher = new HashMap<>();
        }

        public void addBook(Book book) {
            String genre = book.getGenre();
            String author = book.getAuthor();
            String publisher = book.getPublisher();

            catalogByGenre.computeIfAbsent(genre, k -> new ArrayList<>()).add(book);
            catalogByAuthor.computeIfAbsent(author, k -> new ArrayList<>()).add(book);
            catalogByPublisher.computeIfAbsent(publisher, k -> new ArrayList<>()).add(book);
        }

        public List<Book> getBooksByGenre(String genre) {
            return catalogByGenre.getOrDefault(genre, new ArrayList<>());
        }

        public List<Book> getBooksByAuthor(String author) {
            return catalogByAuthor.getOrDefault(author, new ArrayList<>());
        }

        public List<Book> getBooksByPublisher(String publisher) {
            return catalogByPublisher.getOrDefault(publisher, new ArrayList<>());
        }

}
