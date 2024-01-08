package student_slava_subacius.lesson_9;

import java.util.Optional;

public class InMemoryDatabase implements ProductDatabase {
    private Product[] products = new Product[0];

    @Override
    public void save(Product product) {
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[products.length] = product;
        products = newProducts;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equalsIgnoreCase(productTitle.trim())) {
                return Optional.of(product);
            }
        }
        return null;
    }

    @Override
    public Optional<Product> findByTitle() {
        return Optional.empty();
    }
}