package student_svetlana_daugele.lesson_4.level_6_middle;

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

    public int updatedPrice(int newPrice) {
        this.actualPrice = newPrice;
        this.newPrice = newPrice;
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
        if (newPrice < this.minPrice) {
            this.minPrice = newPrice;
        }
        return newPrice;
    }

    String getPriceInformation() {
        return "Company =  \"" + companyName + "\" , " +
                " Current Price = " + newPrice + " , " +
                " Min Price = " + minPrice + " , " +
                " Max Price = " + maxPrice;
    }

    int getMaxPrice(int newPrice) {
        if (newPrice > this.maxPrice) {
            this.maxPrice = newPrice;
        }
        return maxPrice;
    }
}

//public void updatePrice(int newPrice) {
//        if (!initialized) {
//            this.currentPrice = newPrice;
//            this.minPrice = newPrice;
//            this.maxPrice = newPrice;
//            this.initialized = true;
//        } else {
//            this.currentPrice = newPrice;
//            if (newPrice < this.minPrice) {
//                this.minPrice = newPrice;
//            }
//            if (newPrice > this.maxPrice) {
//                this.maxPrice = newPrice;
//            }
//        }
//    }
/*
Необходимо реализовать класс Stock ("акция") таким образом,
чтобы была возможность узнать текущую цену акции,
а также ее максимальную и минимальную стоимость
за период существования.

Класс Stock должен обладать следующими характеристиками:

Свойства:
- Имя компании
- Текущая стоимость
- Минимальная стоимость
- Максимальная стоимость

Методы:
- Обновить текущую стоимость акции updatePrice(int newPrice)
- Получить информацию об акции getPriceInformation()

Имя компании и начальную стоимость необходимо
задавать в момент создания акции.
Текущая, минимальная и максимальная стоимость
должны меняться только через метод updatePrice().

Написать тестовые сценарии для класса Stock в классе StockTest.


10 -> 12 -> 5 -> 7 -> 99 -> 77

Test case max:

Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27


Пример работы с классом Stock:

Stock google = new Stock("GOOG", 10);
String priceInformation = google.getPriceInformation();
System.out.println(priceInformation);
​
google.updatePrice(15);
google.updatePrice(7);
google.updatePrice(14);
​
priceInformation = google.getPriceInformation();
System.out.println(priceInformation);

После выполнения кода вывод в консоли должет быть следующим:
Company = "GOOG", Current Price = 10, Min Price = 10, Max Price = 10
Company = "GOOG", Current Price = 14, Min Price = 7, Max Price = 15
 */