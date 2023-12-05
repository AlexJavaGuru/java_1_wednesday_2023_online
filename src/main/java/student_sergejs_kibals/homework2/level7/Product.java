package student_sergejs_kibals.homework2.level7;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String productName, double productRegularPrice, double productDiscount) {
        this.name = productName;
        this.regularPrice = productRegularPrice;
        this.discount = productDiscount;
    }
    double actualPrice(){
        return regularPrice * (1 - discount / 100);
    }
    void printInformation (){
        System.out.println(name + " regular price = " + regularPrice + ", discount = " + discount);
    }
}
