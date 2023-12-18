package student_artur_zaharov.lesson_4.level6;




class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.maxStock1();
        stockTest.maxStock2();
        stockTest.maxStock3();
        stockTest.maxStock4();
        stockTest.maxStock5();
        stockTest.maxStock6();

    }

    public void maxStock1() {
        int expectedResult = 999;
        Stock stock = new Stock("GOOG", 10.0);
        stock.updatePrice(999);
        Double realResult = stock.getMaxPrice();
        if  (realResult == expectedResult) {
            System.out.println("Test MaxStock1 = passed" );
        }else {
            System.out.println("Test MaxStock1 = failed" );
        }

    }
    public void maxStock2() {
        int expectedResult = 999;
        Stock stock = new Stock("GOOG", 10.0);
        stock.updatePrice(999);
        stock.updatePrice(1);
        Double realResult = stock.getMaxPrice();
        if  (realResult == expectedResult) {
            System.out.println("Test MaxStock2 = passed" );
        }else {
            System.out.println("Test MaxStock2 = failed" );
        }

    }

    public void maxStock3() {
        int expectedResult = 1000;
        Stock stock = new Stock("GOOG", 10.0);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        Double realResult = stock.getMaxPrice();
        if  (realResult == expectedResult) {
            System.out.println("Test MaxStock3 = passed" );
        }else {
            System.out.println("Test MaxStock3 = failed" );
        }

    }
    public void maxStock4() {
        int expectedResult = 1000;
        Stock stock = new Stock("GOOG", 10.0);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        Double realResult = stock.getMaxPrice();
        if  (realResult == expectedResult) {
            System.out.println("Test MaxStock4 = passed" );
        }else {
            System.out.println("Test MaxStock4 = failed" );
        }

    }
    public void maxStock5() {
        int expectedResult = 27;
        Stock stock = new Stock("GOOG", 10.0);
        stock.updatePrice(9);
        stock.updatePrice(27);
        Double realResult = stock.getMaxPrice();
        if  (realResult == expectedResult) {
            System.out.println("Test MaxStock5 = passed" );
        }else {
            System.out.println("Test MaxStock5 = failed" );
        }

    }

    public void maxStock6() {
        int expectedResult = 10;
        Stock stock = new Stock("GOOG", 10.0);
        stock.updatePrice(7);
        stock.updatePrice(9);
        Double realResult = stock.getMaxPrice();
        if  (realResult == expectedResult) {
            System.out.println("Test MaxStock6 = passed" );
        }else {
            System.out.println("Test MaxStock6 = failed" );
        }

    }
}