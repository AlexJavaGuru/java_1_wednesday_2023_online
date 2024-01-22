package student_viktor_kuzmin.homework_lesson_3.level_7;

class Product {
    private final String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public Product setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
        return this;
    }

    public Product setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public double actualPrice() {
        return regularPrice * (1 - discount / 100);
    }

    public void printInformation() {
        System.out.println("Product: " + name);
        System.out.println("Regular price: " + regularPrice);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Actual price: " + actualPrice());
    }
}


