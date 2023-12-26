package student_aleksandra_azbuka.lesson_4;

class Stock {
    private String companyName;
    private int currentPrice;
    private int minPrice;
    private int maxPrice;

    public Stock(String companyName, int actualPrice) {
        this.companyName = companyName;
        this.currentPrice = actualPrice;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;
    }

    public void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }

    int getMaxPrice(int newPrice) {
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
        return maxPrice;
    }

    public String getPriceInformation() {
        return "Company = \"" + companyName + "\", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }
}
