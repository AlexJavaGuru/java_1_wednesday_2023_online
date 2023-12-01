package teacher.lesson_4_if_statement.lessoncode.productexample;

public class ProductDemo {


    public static void main(String[] args) {
        Product banana = new Product("Banana", 100.0, 25.0);
        Product potato = new Product("Potato", 50.0, 25.0);

        banana.printInformation();

        banana.actualPrice();

        double actualPriceBana = banana.actualPrice();
        double actualPricePotato = potato.actualPrice();
        System.out.println("Actual Price for banana - " + actualPriceBana);
        System.out.println("Actual Price for potato - " + actualPricePotato);

        actualPriceBana = actualPriceBana * 2;
        System.out.println(actualPriceBana);

        banana.discount = 75.0;
        double actualPriceAfterDiscount = banana.actualPrice();
        System.out.println(actualPriceAfterDiscount);
    }
}
