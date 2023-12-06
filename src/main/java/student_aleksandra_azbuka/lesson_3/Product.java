package student_aleksandra_azbuka.lesson_3;

class Product {
    String name;
    double regularPrice;
    double discount;

    public Product(String name) {
        this.name = name;
    }
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public double actualPrice() {
        return regularPrice - (regularPrice * discount / 100);
    }
    public void printInformation() {
        System.out.println("Product: " + name);
        System.out.println("Regular Price: $" + regularPrice);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Actual Price: $" + actualPrice());
    }
}
