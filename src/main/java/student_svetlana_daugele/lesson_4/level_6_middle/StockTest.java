package student_svetlana_daugele.lesson_4.level_6_middle;

class StockTest {
    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.actualPriceTest1();//new price = 10
        stockTest.actualPriceTest2();//new price = 12
        stockTest.actualPriceTest3();//new price = 5
        stockTest.actualPriceTest4();//new price = 7
        stockTest.actualPriceTest5();//new price = 99
        stockTest.actualPriceTest6();//new price = 77
        stockTest.maxPriceTest1(); //Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
        stockTest.maxPriceTest2(); //Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
        stockTest.maxPriceTest3();//Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
        stockTest.maxPriceTest4();//Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
        stockTest.maxPriceTest5();// Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
    }
    public void actualPriceTest1() {
        int expectedActualPrice = 10;
        Stock stock = new Stock("GOOGLE", 10);
        int realResult = stock.updatedPrice(10);
        if (realResult == expectedActualPrice) {
            System.out.println("Updated price test = OK");
        } else {
            System.out.println("Updated price test = FAIL");
        }
    }

    public void actualPriceTest2() {
        int expectedActualPrice = 12;
        Stock stock = new Stock("GOOGLE", 10);
        int realResult = stock.updatedPrice(12);
        if (realResult == expectedActualPrice) {
            System.out.println("Updated price test = OK");
        } else {
            System.out.println("Updated price test = FAIL");
        }
    }

    public void actualPriceTest3() {
        int expectedActualPrice = 5;
        Stock stock = new Stock("GOOGLE", 10);
        int realResult = stock.updatedPrice(5);
        if (realResult == expectedActualPrice) {
            System.out.println("Updated price test = OK");
        } else {
            System.out.println("Updated price test = FAIL");
        }
    }

    public void actualPriceTest4() {
        int expectedActualPrice = 7;
        Stock stock = new Stock("GOOGLE", 10);
        int realResult = stock.updatedPrice(7);
        if (realResult == expectedActualPrice) {
            System.out.println("Updated price test = OK");
        } else {
            System.out.println("Updated price test = FAIL");
        }
    }

    public void actualPriceTest5() {
        int expectedActualPrice = 99;
        Stock stock = new Stock("GOOGLE", 10);
        int realResult = stock.updatedPrice(99);
        if (realResult == expectedActualPrice) {
            System.out.println("Updated price test = OK");
        } else {
            System.out.println("Updated price test = FAIL");
        }
    }

    public void actualPriceTest6() {
        int expectedActualPrice = 77;
        Stock stock = new Stock("GOOGLE", 10);
        int realResult = stock.updatedPrice(77);
        if (realResult == expectedActualPrice) {
            System.out.println("Updated price test = OK");
        } else {
            System.out.println("Updated price test = FAIL");
        }
    }
    public void maxPriceTest1() {
        int expectedMaxprice = 999;
        Stock stock = new Stock("GOOGLE", 10);
        int realResult = stock.getMaxPrice(999);
        if (realResult == expectedMaxprice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }
    public void maxPriceTest2() {
        int expectedMaxprice = 999;
        Stock stock = new Stock("GOOGLE", 10);
        stock.getMaxPrice(999);
        int realResult = stock.getMaxPrice(1);
        if (realResult == expectedMaxprice) {
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
