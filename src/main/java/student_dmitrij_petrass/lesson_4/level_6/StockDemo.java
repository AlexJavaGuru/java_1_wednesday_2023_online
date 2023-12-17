package student_dmitrij_petrass.lesson_4.level_6;


class StockDemo {
    public static void main(String[] args) {
        Stock maxima = new Stock("CocaCola",10);
        String priceInformation = maxima.getPriceInformation();
        System.out.println(priceInformation);

        maxima.updatePrice(15);
        maxima.updatePrice(7);
        maxima.updatePrice(14);

        priceInformation = maxima.getPriceInformation();
        System.out.println(priceInformation);




    }
}
