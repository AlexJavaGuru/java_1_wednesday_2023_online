package teacher.lesson_6_arrays_while_loop.lessoncode.stock;

public class StockDemo {

    public static void main(String[] args) {
        Stock googleStock = new Stock("Google", 100);
        googleStock.getPriceInformation();

        googleStock.updatePrice(200);
        googleStock.updatePrice(50);
        googleStock.updatePrice(100);
        googleStock.getPriceInformation();
    }
}
