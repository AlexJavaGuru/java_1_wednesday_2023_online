package student_artur_zaharov.lesson_4.level6;

class StockDemo {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10.0);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
        google.updatePrice(15.0);
        google.updatePrice(7.0);
        google.updatePrice(14.0);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }
}
