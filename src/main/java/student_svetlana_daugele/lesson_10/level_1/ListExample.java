package student_svetlana_daugele.lesson_10.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


class ListExample {
    public static void main(String[] args) {
        List<String> brandList = new ArrayList<>();  // Создаем ArrayList для хранения строк

        brandList.add("DMC");
        brandList.add("Drops");
        brandList.add("Lana Gatto");
        brandList.add("LangYarns");

        System.out.println("Yarns brands: ");

        for (String brand : brandList) {
            System.out.println(brand);
        }

        String searchBrand = "DMC";
        if (!brandList.contains(searchBrand)) {
            System.out.println(searchBrand + " is not found.");
        } else {
            System.out.println(searchBrand + " is found.");
        }

        String brandToRemove = "Drops";
        brandList.remove(brandToRemove);


        System.out.println("New brands' list after deleting  " + brandToRemove + ":");

        for (String brand : brandList) {
            System.out.println(brand);
        }
        LinkedList<String> productList = new LinkedList<>();

        productList.add("Yarn");
        productList.add("Needles");
        productList.add("Fabric");
        productList.add("Accessories");


        System.out.println("Products'list:");

        for (String product : productList) {
            System.out.println(product);
        }

        productList.addFirst("Cables");

        productList.addLast("Patterns");

        System.out.println("\nNew products list:");

        for (String product : productList) {
            System.out.println(product);
        }

        String firstProduct = productList.pollFirst();
        System.out.println("\nThe first deleted product: " + firstProduct);

        String lastProduct = productList.pollLast();
        System.out.println("The last deleted product: " + lastProduct);


        System.out.println("\nThe final product list:");

        for (String product : productList) {
            System.out.println(product);
        }
    }
}