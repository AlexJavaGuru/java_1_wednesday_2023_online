package student_aleksandra_azbuka.lesson_3;

class ProductDemo {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop");
        laptop.setRegularPrice(1000.0);
        laptop.setDiscount(15.0);
        laptop.printInformation();
    }
}
