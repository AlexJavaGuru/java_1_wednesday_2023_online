package teacher.lesson_10_collections.lessoncode;

import lesson_2.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapQuantityAccounting {

    public static void main(String[] args) {
        Map<String, Integer> productQuantity = new HashMap<>();

        productQuantity.put("Laptop", 50);
        productQuantity.put("Monitor", 10);
        productQuantity.put("GTX4080", 100);

        //Update after purchase
        productQuantity.put("Laptop", productQuantity.get("Laptop") - 1);
        productQuantity.put("Laptop", productQuantity.get("Laptop") - 1);
        productQuantity.put("Laptop", productQuantity.get("Laptop") - 1);
        productQuantity.put("Laptop", productQuantity.get("Laptop") - 1);
        productQuantity.put("Laptop", productQuantity.get("Laptop") - 1);

        for (Map.Entry<String, Integer> entry : productQuantity.entrySet()) {
            System.out.println("Key - " + entry.getKey() + " value - " + entry.getValue());
        }
    }
}
