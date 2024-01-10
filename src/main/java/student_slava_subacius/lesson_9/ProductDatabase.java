package student_slava_subacius.lesson_9;

import java.util.Optional;

public interface ProductDatabase {
    void save(Product product);


    Optional <Product> findByTitle (String productTitle) ;

    Optional<Product> findByTitle();
}

