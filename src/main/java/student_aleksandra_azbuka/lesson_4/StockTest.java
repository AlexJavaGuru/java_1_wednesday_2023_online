package student_aleksandra_azbuka.lesson_4;

class StockTest {
    public static void main(String[] args) {
        Stock google = new Stock("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);
        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        testMaxPrice1(); //Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
        testMaxPrice2(); //Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
        testMaxPrice3(); //Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
        testMaxPrice4(); //Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
        testMaxPrice5(); //Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
    }

    public static void testMaxPrice1() {
        int expectedResult = 999;
        Stock stock = new Stock("GOOG", 10);
        int realResult = stock.getMaxPrice(999);
        if  (realResult == expectedResult) {
            System.out.println("Test MaxPrice1 = passed" );
        }else {
            System.out.println("Test MaxPrice1 = failed" );
        }
    }

    public static void testMaxPrice2() {
        int expectedResult = 999;
        Stock stock = new Stock("GOOG", 10);
        stock.getMaxPrice(1); //failed tc
        int realResult = stock.getMaxPrice(1);
        if  (realResult == expectedResult) {
            System.out.println("Test MaxPrice2 = passed" );
        }else {
            System.out.println("Test MaxPrice2 = failed" );
        }
    }

    public static void testMaxPrice3() {
        int expectedMaxprice = 1000;
        Stock stock = new Stock("GOOG", 10);
        stock.getMaxPrice(999);
        stock.getMaxPrice(2);
        int realResult = stock.getMaxPrice(1000);
        if (realResult == expectedMaxprice) {
            System.out.println("Test MaxPrice3 = passed");
        } else {
            System.out.println("Test MaxPrice3 = failed");
        }
    }

    public static void testMaxPrice4() {
        int expectedMaxprice = 1000;
        Stock stock = new Stock("GOOG", 10);
        stock.getMaxPrice(999);
        stock.getMaxPrice(2);
        stock.getMaxPrice(1000);
        int realResult = stock.getMaxPrice(8);
        if (realResult == expectedMaxprice) {
            System.out.println("Test MaxPrice4 = passed");
        } else {
            System.out.println("Test MaxPrice4 = failed");
        }
    }

    public static void testMaxPrice5() {
        int expectedMaxprice = 27;
        Stock stock = new Stock("GOOGLE", 10);
        stock.getMaxPrice(9);
        int realResult = stock.getMaxPrice(27);
        if (realResult == expectedMaxprice) {
            System.out.println("Test MaxPrice5 = passed");
        } else {
            System.out.println("Test MaxPrice5 = failed");
        }
    }

}
