package student_svetlana_daugele.lesson_3.level_7_senior;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product ("DROPS ALPACA");
        product.setRegularPrice(2.85);
        product.setDiscount(30);
        product.printInformation();
    }
}
