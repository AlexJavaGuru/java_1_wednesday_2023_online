package student_dmitrij_petrass.lesson_4.level_6;


class Stock {
    private String productName;
    private Double currentPrice;
    private Double minPrice;
    private Double maxPrice;

    public Stock(String productName, double initialPrice) {
        this.productName = productName;
        this.currentPrice = initialPrice;
        this.minPrice = initialPrice;
        this.maxPrice = initialPrice;
    }

    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;
        if (newPrice < minPrice) {
            this.minPrice = newPrice;
        }
        if (newPrice > maxPrice) {
            this.maxPrice = newPrice;
        }
    }

    public Double getMaxPrice() {
        return maxPrice;
    }

    public String getPriceInformation() {
        return "Company name = " + productName + ", Current price = " + currentPrice + ", MIN Price = " + minPrice + ", MAX Price = " + maxPrice;
    }
}


