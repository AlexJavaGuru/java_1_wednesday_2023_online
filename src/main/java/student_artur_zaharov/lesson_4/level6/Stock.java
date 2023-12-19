package student_artur_zaharov.lesson_4.level6;

class Stock {

    private String name;
    private Double actualPrice;
    private Double minPrice;
    private Double maxPrice;

    public Stock(String name, Double actualPrice) {
        this.name = name;
        this.actualPrice = actualPrice;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;
    }

    public void updatePrice (double newPrice) {
        actualPrice = newPrice;
        if (newPrice > maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice < minPrice) {
            minPrice = newPrice;
        }
    }
    public Double getMaxPrice(){
        return maxPrice;
}

    public Double getMinPrice(){
        return minPrice;
    }

    public String getPriceInformation(){
        System.out.println("Stock name" + name + ", " + "Actual Price = " + actualPrice + ", " + "Minimum price = " +minPrice + ", " + "Maximum price =" + maxPrice);
        return null;
    }
}
