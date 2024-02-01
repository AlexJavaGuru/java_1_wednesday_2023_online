package student_viktor_kuzmin.homework_lesson_4.level_6;


class StockDemo {
    public static void main(String[] args) {

        Stock Google = new Stock("GOOG", 10);

        String priceInformation = Google.getPriceInformation();
        System.out.println(priceInformation);

        Google.updatePrice(15);
        Google.updatePrice(7);
        Google.updatePrice(14);

        priceInformation = Google.getPriceInformation();
        System.out.println(priceInformation);
    }
}