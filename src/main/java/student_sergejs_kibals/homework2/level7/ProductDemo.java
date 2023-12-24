package student_sergejs_kibals.homework2.level7;

class ProductDemo {

    public static void main(String[] args) {

        Product Product1 = new Product("Apple", 10, 25);
        Product Product2 = new Product("Orange", 20, 50);

        Product1.printInformation();
        Product2.printInformation();

        System.out.println();
        System.out.println("Actual price for " + Product1.name + " = " + Product1.actualPrice());
        System.out.println("Actual price for " + Product2.name + " = " + Product2.actualPrice());

        Product1.regularPrice = 20;
        Product1.discount = 50;

        Product2.regularPrice = 40;
        Product2.discount = 100;

        System.out.println();
        Product1.printInformation();
        Product2.printInformation();

        System.out.println();
        System.out.println("Actual price for " + Product1.name + " = " + Product1.actualPrice());
        System.out.println("Actual price for " + Product2.name + " = " + Product2.actualPrice());
    }
}
