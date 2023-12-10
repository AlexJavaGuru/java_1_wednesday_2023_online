package student_slava_subacius;

class Product {
    private String name;
    public double regularPrice;
    public double discount;

    public Product(String name, double regularPrice, double discount) {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
    double actvalPrice() {
       return regularPrice * (1 - discount / 100);

    }
    void printInformation() {
        System.out.println("Product name: " + name + " , Regular Price = " + regularPrice + ", Discount = " + discount);
    }

}


