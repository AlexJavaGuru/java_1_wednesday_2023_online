package student_svetlana_daugele.lesson_4.level_6;

class Stock {
    String companyName;
    int actualPrice;
    int minPrice;
    int maxPrice;
    int newPrice;

    public Stock(String companyName, int actualPrice) {
        this.actualPrice = actualPrice;
        this.companyName = companyName;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;
        this.newPrice = actualPrice;
    }

    public void updatedPrice(int newPrice) {
        this.actualPrice = newPrice;
        this.newPrice = newPrice;
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
    }

    String getPriceInformation() {
        return "Company =  \"" + companyName + "\" , " +
                " Current Price = " + newPrice + " , " +
                " Min Price = " + minPrice + " , " +
                " Max Price = " + maxPrice;
    }

    int getMaxPrice() {
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
        return maxPrice;
    }
}

