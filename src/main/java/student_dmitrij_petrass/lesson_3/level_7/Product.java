package student_dmitrij_petrass.lesson_3.level_7;

class Product {
    private String name;
    private Double regularPrice;
    private Double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actialPrice() {
        return regularPrice * (1 - discount / 100);
    }

    void printInformation() {
        System.out.println("Product name: " + name + "Regular Price = " + regularPrice + ", Discount = " + discount);
    }
}