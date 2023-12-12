package student_dmitrij_petrass.lesson_4.level_6;


class StockDemo {
    public static void main(String[] args) {
        Stock beta = new Stock("BETA",10);
        String priceInformation = beta.getPriceInformation();
        System.out.println(priceInformation);

        beta.updatePrice(15);
        beta.updatePrice(7);
        beta.updatePrice(14);

        priceInformation = beta.getPriceInformation();
        System.out.println(priceInformation);




    }
}
