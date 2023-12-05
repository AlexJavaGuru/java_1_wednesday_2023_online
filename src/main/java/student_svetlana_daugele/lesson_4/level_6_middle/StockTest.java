package student_svetlana_daugele.lesson_4.level_6_middle;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.actualPriceTest(10,10 );//new price = 10
        stockTest.actualPriceTest(12,12 );
        stockTest.actualPriceTest(5,5 );
        stockTest.actualPriceTest(7,7 );
        stockTest.actualPriceTest(99,99 );
        stockTest.actualPriceTest(77,77 );


        stockTest.maxPriceTest1(); //Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
        stockTest.maxPriceTest2(); //Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
        stockTest.maxPriceTest3();//Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
        stockTest.maxPriceTest4();//Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
        stockTest.maxPriceTest5();// Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
    }
    public void actualPriceTest(int expectedActualPrice, int newPrice) {
        Stock stock = new Stock("GOOGLE", 10);
        int realResult = stock.updatedPrice(newPrice);
        if (realResult == expectedActualPrice) {
            System.out.println("Updated price test = OK");
        } else {
            System.out.println("Updated price test = FAIL");
        }
    }

    public void maxPriceTest1() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("GOOGLE", 10);
        stock.updatedPrice(999);
        stock.getMaxPrice(999);
        int realResult = stock.getMaxPrice(999);
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }
    public void maxPriceTest2() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("GOOGLE", 10);
        stock.updatedPrice(999);
        stock.updatedPrice(1);
        stock.getMaxPrice(1);
        int realResult = stock.getMaxPrice(1);
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }
    public void maxPriceTest3() {
        int expectedMaxprice = 1000;
        Stock stock = new Stock("GOOGLE", 10);
        stock.getMaxPrice(999);
        stock.getMaxPrice(2);
        stock.getMaxPrice(1000);
        int realResult = stock.getMaxPrice(1000);
        if (realResult == expectedMaxprice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }
    public void maxPriceTest4() {
        int expectedMaxprice = 1000;
        Stock stock = new Stock("GOOGLE", 10);
        stock.getMaxPrice(999);
        stock.getMaxPrice(2);
        stock.getMaxPrice(1000);
        int realResult = stock.getMaxPrice(8);
        if (realResult == expectedMaxprice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }
    public void maxPriceTest5() {
        int expectedMaxprice = 27;
        Stock stock = new Stock("GOOGLE", 10);
        stock.getMaxPrice(9);
        int realResult = stock.getMaxPrice(27);
        if (realResult == expectedMaxprice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }
}
