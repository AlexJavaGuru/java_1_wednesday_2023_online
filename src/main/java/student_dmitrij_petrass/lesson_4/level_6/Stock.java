package student_dmitrij_petrass.lesson_4.level_6;


class Stock {
    private String companyName;
    private Double currentPrice;
    private Double minPrice;
    private Double maxPrice;

    public Stock(String companyName, double initialPrice) {
        this.companyName = companyName;
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

    public String getPriceInformation() {
        return "Company name = " + companyName + ", Current price = " + currentPrice + ", MIN Price = " + minPrice + ", MAX Price = " + maxPrice;
    }
}


