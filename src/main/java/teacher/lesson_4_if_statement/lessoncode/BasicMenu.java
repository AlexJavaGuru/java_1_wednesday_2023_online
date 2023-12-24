package teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class BasicMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!");
        int userInput;
        do {
            System.out.println("Select 1 - Add product");
            System.out.println("Select 2 - Search product");
            System.out.println("Select 3 - Delete product");
            System.out.println("Select 0 - Exit");

            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Creating new product. Put your details...");
                    break;
                case 2:
                    System.out.println("Give criteria...");
                    break;
                case 3:
                    System.out.println("Type product Id to be deleted...");
                    break;
                default:
                    System.out.println("Exiting...");
            }
        } while (userInput != 0);
    }
}
