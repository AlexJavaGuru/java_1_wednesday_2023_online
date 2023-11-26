package student_svetlana_daugele.lesson_3.level_7_senior;

public class Product {
    String name;
    double regularPrice;
    double discount;

    public Product (String name) {

        this.name = name;
    }
    public void setRegularPrice(double regularPrice) {

        this.regularPrice = regularPrice;
    }
    public void setDiscount(double discount) {

        this.discount = discount;
    }
    public double actualPrice() {
        double result = regularPrice * (1 - discount / 100);
        return Math.round((result*100)/100);
    }

    public void printInformation() {
        System.out.println("Product Name: " + name);
        System.out.println("Regular Price: " + regularPrice + " EUR");
        System.out.println("Discount: " + discount + "%");
        System.out.println("Actual Price: " + actualPrice() + " EUR");
    }
}
