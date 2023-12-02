package student_svetlana_daugele.lesson_4.level_6_middle;

class StockDemo {
    public static void main(String[] args) {
    Stock google = new Stock("GOOG",10);

    String priceInformation = google.getPriceInformation();
System.out.println(priceInformation);

google.updatedPrice(15);
google.updatedPrice(7);
google.updatedPrice(14);

    priceInformation = google.getPriceInformation();
System.out.println(priceInformation);
}
}
