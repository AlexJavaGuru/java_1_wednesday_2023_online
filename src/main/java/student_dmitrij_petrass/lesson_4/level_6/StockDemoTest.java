package student_dmitrij_petrass.lesson_4.level_6;

class StockDemoTest {

    public static void main(String[] args) {
        StockDemoTest stockTest = new StockDemoTest();
        stockTest.test1MaxPrice();
        stockTest.test2MaxPrice();
        stockTest.test3MaxPrice();
        stockTest.test4MaxPrice();
        stockTest.test5MaxPrice();


    }

    public void test1MaxPrice() {
        int expectedResult = 999;
        Stock stock = new Stock("cocacola", 10);
        stock.updatePrice(999);
        double realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 1 Max Price = has passed");
        } else {
            System.out.println("Test 1 Max Price = Failed!");
        }
    }

    public void test2MaxPrice() {
        int expectedResult = 999;
        Stock stock = new Stock("cocacola", 10);
        stock.updatePrice(999);
        stock.updatePrice(1);
        double realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 2 Max Price = has passed");
        } else {
            System.out.println("Test 2 Max Price = Failed!");
        }
    }
    public void test3MaxPrice() {
        int expectedResult = 1000;
        Stock stock = new Stock("cocacola", 10);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        double realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 3 Max Price = has passed");
        } else {
            System.out.println("Test 3 Max Price = Failed!");
        }
    }
    public void test4MaxPrice() {
        int expectedResult = 1000;
        Stock stock = new Stock("cocacola", 10);
        stock.updatePrice(999);
        stock.updatePrice(2);
        stock.updatePrice(1000);
        stock.updatePrice(8);
        double realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 3 Max Price = has passed");
        } else {
            System.out.println("Test 3 Max Price = Failed!");
        }
    }
    public void test5MaxPrice() {
        int expectedResult = 27;
        Stock stock = new Stock("cocacola", 10);
        stock.updatePrice(9);
        stock.updatePrice(27);

        double realResult = stock.getMaxPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 3 Max Price = has passed");
        } else {
            System.out.println("Test 3 Max Price = Failed!");
        }
    }

}
