package student_slava_subacius.lesson_4_6;

class Stock {

    private String company;
    private double currentPrice;
    private double minPrice;
    private double maxPrice;


    public Stock(String company, double initialPrice) {
        this.company = company;
        this.currentPrice = initialPrice;
        this.minPrice = initialPrice;
        this.maxPrice = initialPrice;
    }

    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;


        if (newPrice < minPrice) {
            minPrice = newPrice;
        }
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    public String getPriceInformation() {
        return "Company = " + company + " , Current Price = " + currentPrice
                + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }
}