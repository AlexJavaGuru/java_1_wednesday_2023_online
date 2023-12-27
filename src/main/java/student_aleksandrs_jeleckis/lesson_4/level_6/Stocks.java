package student_aleksandrs_jeleckis.lesson_4.level_6;

class Stocks {

    private String stockName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;


    public Stocks(String name, int currentPrice) {
        this.stockName = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }


    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (newPrice < minPrice) {
            this.minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            this.maxPrice = newPrice;
        }
    }
    int getMaxPrice() {
        return maxPrice;
    }

    int getCurrentPrice(){
        return currentPrice;
    }

    String getPriceInformation() {
        return "Stock name: " + stockName + ", Current Price = " + currentPrice
                + ", Minimum Price = " + minPrice + ", Maximum Price = " + maxPrice;
    }


}
