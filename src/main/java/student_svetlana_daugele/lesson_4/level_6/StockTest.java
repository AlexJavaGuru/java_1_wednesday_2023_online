package student_svetlana_daugele.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.maxPriceTest1(); //Изменение цены акции: 999  = Максимальная цена за указанный переуд: 999
        stockTest.maxPriceTest2(); //Изменение цены акции: 999 -> 1  = Максимальная цена за указанный переуд: 999
        stockTest.maxPriceTest3();//Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный переуд: 1000
        stockTest.maxPriceTest4();//Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный переуд: 1000
        stockTest.maxPriceTest5();// Изменение цены акции: 9 -> 27 = Максимальная цена за указанный переуд: 27
    }



    public void maxPriceTest1() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("GOOGLE", 10);
        stock.updatedPrice(999);
        int realResult = stock.getMaxPrice();
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
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }

    public void maxPriceTest3() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("GOOGLE", 10);
        stock.updatedPrice(999);
        stock.updatedPrice(2);
        stock.updatedPrice(1000);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }

    public void maxPriceTest4() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("GOOGLE", 10);
        stock.updatedPrice(2);
        stock.updatedPrice(1000);
        stock.updatedPrice(8);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }
    public void maxPriceTest5() {
        int expectedMaxPrice = 27;
        Stock stock = new Stock("GOOGLE", 10);
        stock.updatedPrice(9);
        stock.updatedPrice(27);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }

}
