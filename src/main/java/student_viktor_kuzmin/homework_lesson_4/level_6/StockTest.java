package student_viktor_kuzmin.homework_lesson_4.level_6;

class StockTest {

    public static void main(String[] args) {

        StockTest stockTest = new StockTest();
        stockTest.maxPriceTest1();
        stockTest.maxPriceTest2();
        stockTest.maxPriceTest3();
        stockTest.maxPriceTest4();
        stockTest.maxPriceTest5();
    }

    public void maxPriceTest1() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }

    public void maxPriceTest2() {
        int expectedMaxPrice = 999;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        stock.updatePrice(1);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }

    public void maxPriceTest3() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }

    public void maxPriceTest4() {
        int expectedMaxPrice = 1000;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }

    public void maxPriceTest5() {
        int expectedMaxPrice = 27;
        Stock stock = new Stock("GOOG", 10);
        stock.updatePrice(9);
        stock.updatePrice(27);
        int realResult = stock.getMaxPrice();
        if (realResult == expectedMaxPrice) {
            System.out.println("Max price test = OK");
        } else {
            System.out.println("Max price test = FAIL");
        }
    }

}










