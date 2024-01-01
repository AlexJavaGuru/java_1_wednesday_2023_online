package student_aleksandrs_jeleckis.lesson_4.level_6;

class StockTest {
    Stocks stocks = new Stocks("GOOG", 10);


    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatedPrice1();
        stockTest.updatedPrice2();
        stockTest.updatedPrice3();
        stockTest.updatedPrice4();
        stockTest.updatedPrice5();
        stockTest.updatedPrice6();
        stockTest.maxPrice1();
        stockTest.maxPrice2();
        stockTest.maxPrice3();
        stockTest.maxPrice4();
        stockTest.maxPrice5();

    }

    void updatedPrice1() {
        int expectedPrice = 10;
        stocks.updatePrice(10);
        int realPrice = stocks.getCurrentPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Price 1 passed");
        } else {
            System.out.println("Test Price 1 failed");
        }
    }

    void updatedPrice2() {
        int expectedPrice = 12;
        stocks.updatePrice(12);
        int realPrice = stocks.getCurrentPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Price 2 passed");
        } else {
            System.out.println("Test Price 2 failed");
        }
    }

    void updatedPrice3() {
        int expectedPrice = 5;
        stocks.updatePrice(5);
        int realPrice = stocks.getCurrentPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Price 3 passed");
        } else {
            System.out.println("Test Price 3  failed");
        }
    }

    void updatedPrice4() {
        int expectedPrice = 7;
        stocks.updatePrice(7);
        int realPrice = stocks.getCurrentPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Price 4 passed");
        } else {
            System.out.println("Test Price 4 failed");
        }
    }

    void updatedPrice5() {
        int expectedPrice = 99;
        stocks.updatePrice(99);
        int realPrice = stocks.getCurrentPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Price 5 passed");
        } else {
            System.out.println("Test Price 5 failed");
        }
    }

    void updatedPrice6() {
        int expectedPrice = 77;
        stocks.updatePrice(77);
        int realPrice = stocks.getCurrentPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Price 6 passed");
        } else {
            System.out.println("Test Price 6 failed");
        }
    }

    void maxPrice1() {
        Stocks stocksMaxPrice = new Stocks("GOOG", 10);
        int expectedPrice = 999;
        stocksMaxPrice.updatePrice(999);
        int realPrice = stocksMaxPrice.getMaxPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Max Price 1 passed");
        } else {
            System.out.println("Test Max Price 1 failed");
        }
    }

    void maxPrice2() {
        Stocks stocksMaxPrice = new Stocks("GOOG", 10);
        int expectedPrice = 999;
        stocksMaxPrice.updatePrice(999);
        stocksMaxPrice.updatePrice(1);
        int realPrice = stocksMaxPrice.getMaxPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Max Price 2 passed");
        } else {
            System.out.println("Test Max Price 2 failed");
        }
    }

    void maxPrice3() {
        Stocks stocksMaxPrice = new Stocks("GOOG", 10);
        int expectedPrice = 1000;
        stocksMaxPrice.updatePrice(999);
        stocksMaxPrice.updatePrice(2);
        stocksMaxPrice.updatePrice(1000);
        int realPrice = stocksMaxPrice.getMaxPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Max Price 3 passed");
        } else {
            System.out.println("Test Max Price 3 failed");
        }
    }

    void maxPrice4() {
        Stocks stocksMaxPrice = new Stocks("GOOG", 10);
        int expectedPrice = 1000;
        stocksMaxPrice.updatePrice(999);
        stocksMaxPrice.updatePrice(2);
        stocksMaxPrice.updatePrice(1000);
        stocksMaxPrice.updatePrice(8);
        int realPrice = stocksMaxPrice.getMaxPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Max Price 4 passed");
        } else {
            System.out.println("Test Max Price 4 failed");
        }
    }

    void maxPrice5() {
        Stocks stocksMaxPrice = new Stocks("GOOG", 10);
        int expectedPrice = 27;
        stocksMaxPrice.updatePrice(9);
        stocksMaxPrice.updatePrice(27);
        int realPrice = stocksMaxPrice.getMaxPrice();
        if (expectedPrice == realPrice) {
            System.out.println("Test Max Price 5 passed");
        } else {
            System.out.println("Test Max Price 5 failed");
        }
    }
}
