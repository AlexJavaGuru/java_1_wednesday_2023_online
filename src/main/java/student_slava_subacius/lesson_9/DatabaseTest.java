package student_slava_subacius.lesson_9;

import java.util.Optional;

public class DatabaseTest {
    public static void main(String[] args) {
        InMemoryDatabase database = new InMemoryDatabase();
        database.save(new Product("Product1"));
        database.save(new Product("Product2"));
        database.save(new Product("Product3"));

        Optional<Product> foundProduct = database.findByTitle("Product3");


        if (foundProduct != null) {
            System.out.println("Found product: " + foundProduct.get().getTitle());
        } else {
            System.out.println("Product not found.");
        }
        
    }
}



