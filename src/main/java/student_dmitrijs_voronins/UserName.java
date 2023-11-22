package student_dmitrijs_voronins;

import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Create scanner object
        System.out.println("Enter user name");

        String userName = scanner.nextLine();  // read user input
        System.out.println("Username is :" + userName);  // output user name
    }
}
//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!
//Task_8