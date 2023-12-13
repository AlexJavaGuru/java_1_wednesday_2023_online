package student_dmitrijs_voronins.lesson_4.level_6;

//Свойства:
//- Имя компании
//- Текущая стоимость
//- Минимальная стоимость
//- Максимальная стоимость
class Stock {
    String companyName;
    int actualyPrice;
    int minPrice;
    int maxPrice;
    int newPrice;

    public Stock(String companyName, int actualyPrice) {
        this.actualyPrice = actualyPrice;
        this.companyName = companyName;
    }

    public int updatePrice(int newPrice) {
        this.actualyPrice = newPrice;
        this.newPrice = newPrice;
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;


        }
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;


        }
        return newPrice;


    }

    public int getMaxPrice() {
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
        return maxPrice;
    }

    public String getPriceInformation() {
        return ("Company =  \"" + companyName + "\"," +
                " Current Price = " + newPrice + ", " +
                "Min Price = " + minPrice + ", " +
                "Max Price = " + maxPrice);
    }
}

//Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
//Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15