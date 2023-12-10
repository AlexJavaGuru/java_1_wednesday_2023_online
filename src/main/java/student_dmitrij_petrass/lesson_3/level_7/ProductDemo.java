package student_dmitrij_petrass.lesson_3.level_7;

class ProductDemo {
    public static void main(String[] args) {

        Product cocacola = new Product(" Coca-cola", 3.50, 15);

        cocacola.printInformation();

        double actualPrice = cocacola.actialPrice();
        System.out.println(actualPrice);

    }
}
