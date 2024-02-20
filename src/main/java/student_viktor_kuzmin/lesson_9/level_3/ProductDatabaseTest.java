package student_viktor_kuzmin.lesson_9.level_3;

class ProductDatabaseTest {

    public static void main(String[] args) {
        ProductDatabase database = new InMemoryDatabase();

        database.save(new Product("Product1"));
        database.save(new Product("Product2"));
        database.save(new Product("Product3"));

        System.out.println(database.findByTitle("Product2"));
        System.out.println(database.findByTitle("Product4"));
    }
}

