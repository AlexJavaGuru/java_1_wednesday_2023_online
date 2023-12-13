package student_dmitrijs_voronins.lesson_4.level_6;

//Test case max:
//
//Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999 //maxTest()
//Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
//Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
//Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
//Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.maxTest();
        stockTest.maxTest1();
        stockTest.maxTest2();
        stockTest.maxTest3();
        stockTest.maxTest4();

    }

    public void maxTest() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);

        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = Pass");
        } else {
            System.out.println("Max price test = Failed");
        }
    }

    public void maxTest1() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        stock.updatePrice(2);

        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = Pass");
        } else {
            System.out.println("Max price test = Failed");
        }
    }

    public void maxTest2() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        stock.updatePrice(1);
        stock.updatePrice(1000);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = Pass");
        } else {
            System.out.println("Max price test = Failed");
        }
    }

    public void maxTest3() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        stock.updatePrice(1);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = Pass");
        } else {
            System.out.println("Max price test = Failed");
        }
    }

    public void maxTest4() {
        int expectedMaxPrice = 27;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(9);
        stock.updatePrice(27);

        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = Pass");
        } else {
            System.out.println("Max price test = Failed");
        }
    }

}