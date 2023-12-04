package student_slava_subacius;

public class ProductDemo {
    public static void main(String[] args) {
       Product phone = new Product("Phone", 1000.0, 25.0);

       phone.printInformation();

       double actualPrice = phone.actvalPrice();
        System.out.println(actualPrice);

    }
}
