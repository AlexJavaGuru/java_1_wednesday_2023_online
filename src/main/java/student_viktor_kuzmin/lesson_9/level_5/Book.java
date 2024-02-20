package student_viktor_kuzmin.lesson_9.level_5;

class Book {
    private String author;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    private String name;

    public Book(String author, String name) {
        this.author = author;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return author.equalsIgnoreCase(book.author) && name.equalsIgnoreCase(book.name);
    }
}

