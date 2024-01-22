package student_viktor_kuzmin.homework_lesson_3.level_7;

class ProductDemo {
    public static void main(String[] args) {

        Product product = new Product("ASUS").setRegularPrice(990).setDiscount(15.0);
        product.printInformation();
    }
}