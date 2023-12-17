package teacher.lesson_6_arrays_while_loop.lessoncode.stock;

public class Stock {

    private String name;
    private double actualPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String name, double actualPrice) {
        this.name = name;
        this.actualPrice = actualPrice;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;
    }

    public void updatePrice(int newPrice) {
        actualPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }

    public void getPriceInformation() {
        System.out.println("Stock Name: " + name + ", " + "Actual Price = " + actualPrice + ", " + "Min = " + minPrice + ", Max = " + maxPrice);
    }
}
