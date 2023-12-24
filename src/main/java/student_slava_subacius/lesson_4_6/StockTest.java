package student_slava_subacius.lesson_4_6;

public class StockTest {
    public static void main(String[] args) {
        Stock company = new Stock("GOOG", 10);
        String priceInformation = company.getPriceInformation();
        System.out.println(priceInformation);

        company.updatePrice(15);
        company.updatePrice(7);
        company.updatePrice(14);

        priceInformation = company.getPriceInformation();
        System.out.println(priceInformation);
    }
}
