package student_aleksandrs_jeleckis.lesson_4.level_6;

 class StocksDemo {
    public static void main(String[] args) {

        Stocks google = new Stocks("GOOG", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

    }
}
